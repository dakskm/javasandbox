package excercises.http.asynchttpclient;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Response;

import java.util.concurrent.Future;

public class AsyncHttpClientTest1 {
    public static void main(String args[]) {
        AsyncHttpClient asyncHttpClient = new DefaultAsyncHttpClient();

        try {
            Future<Response> f = asyncHttpClient.prepareGet("https://www.apple.com").execute();

            System.out.println(f.get().getStatusCode());

            asyncHttpClient.close();
            System.out.println("done");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
