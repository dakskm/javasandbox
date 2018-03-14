package excercises.http.asynchttpclient;

import static org.asynchttpclient.Dsl.*;

import org.asynchttpclient.*;

import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientTest3 {
    public static void main(String[] args) {
        System.out.println("program starts");

        AsyncHttpClient asyncHttpClient = asyncHttpClient();

        CompletableFuture<Response> promise = asyncHttpClient
                .prepareGet("https://www.apple.com/iphone/")
                .execute()
                .toCompletableFuture()
                .exceptionally(t -> {
                    System.out.println(t.getMessage());
                    return null;
                })
                .thenApply(resp -> {
                    System.out.println(resp.getStatusCode());
                    return resp;
                });

        promise.join();

        System.out.println("program ends");
    }
}
