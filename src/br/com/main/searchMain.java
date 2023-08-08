package br.com.main;

import br.com.felipe.screenmatch.models.Media;
import br.com.felipe.screenmatch.models.MediaOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class searchMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var search = input.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=8318ad6c";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //Media myMedia = gson.fromJson(response.body(), Media.class);
        MediaOmdb myMediaomdb = gson.fromJson(response.body(), MediaOmdb.class);
        System.out.println("Media: " + myMediaomdb);

        Media myMedia = new Media(myMediaomdb);
        System.out.println(myMedia);
    }
}
