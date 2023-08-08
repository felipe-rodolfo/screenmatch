package br.com.main;

import br.com.felipe.screenmatch.models.Media;
import br.com.felipe.screenmatch.models.MediaOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchMain {
    private static final String API_KEY  = "8318ad6c";
    private static final String OMDB_API_URL  = "https://www.omdbapi.com/?t=%s&apikey=%s";
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner input = new Scanner(System.in);
        List<Media> medias = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        while (true){

            System.out.println("Type in a movie for search: ");
            var search = input.nextLine();

            if(search.equalsIgnoreCase("leave")){
                break;
            }

            try {
                Media myMedia = fetchAndParseMedia(search, gson);
                medias.add(myMedia);
            } catch (IOException e) {
                System.out.println("IO Exception: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        writeToJsonFile(medias, gson);
        System.out.println("The program finished correctly!");
    }

    private static Media fetchAndParseMedia(String search, Gson gson) throws IOException, InterruptedException {
        String address = String.format(OMDB_API_URL, search.replace(" ", "+"), API_KEY);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        MediaOmdb myMediaOmdb = gson.fromJson(response.body(), MediaOmdb.class);
        return new Media(myMediaOmdb);
    }

    private static void writeToJsonFile(List<Media> medias, Gson gson) {
        try (FileWriter writer = new FileWriter("movies.json")) {
            writer.write(gson.toJson(medias));
            System.out.println("Data written to movies.json");
        } catch (IOException e) {
            System.out.println("Error writing to JSON file: " + e.getMessage());
        }
    }
}
