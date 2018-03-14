package excercises.http.asynchttpclient;

import org.asynchttpclient.AsyncCompletionHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Response;

public class AsyncHttpClientTest2 {
    public static void main(String[] args) {
        System.out.println("program starts");

        final AsyncHttpClient asyncHttpClient = new DefaultAsyncHttpClient();

        asyncHttpClient.prepareGet("https://www.apple.com/iphone/").execute(new AsyncCompletionHandler<Response>() {
            @Override
            public Response onCompleted(Response response) {
                System.out.println("response:\n" + response.getStatusCode() + response.getStatusText());

                return response;
            }

            @Override
            public void onThrowable(Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        System.out.println("program ends");
    }
}
