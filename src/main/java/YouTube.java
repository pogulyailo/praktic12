package main.java;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.deploy.net.HttpResponse;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class YouTube {
    public static void main(String[] args) throws ExecutionException, InterruptedException, UnirestException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value:");
        String value = scanner.nextLine();

        HttpResponse<String> response = Unirest.get("https://www.googleapis.com/youtube/v3/commentThreads")

                .queryString("part", "snippet,replies" )
                .queryString("videoId", "jL3BvPzEtLY")
                .asString();




    }
}
