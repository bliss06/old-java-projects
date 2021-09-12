package http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        String path = "https://www.nseindia.com/api/option-chain-indices?symbol=BANKNIFTY";
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("HEAD");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            
            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
            System.out.println( connection.getResponseMessage() );
            
            //Get headers
            Map<String,List<String>> headers = connection.getHeaderFields();

            for (String key : headers.keySet()) {
                System.out.println(key + ": " + headers.get(key));
            }
            //headers.forEach((s, ls)->System.out::println("Key: " + s + "Value: " +))
        } catch(Exception e){
            System.out.printlne(e.getResponseMessage));
            
        }
    }
}
