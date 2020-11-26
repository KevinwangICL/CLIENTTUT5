import java.net.*;
import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        URL myURL = null;
        try {
            myURL = new URL("http://imperial.ac.uk");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) myURL.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            conn.setRequestMethod("GET");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        conn.setRequestProperty("Accept", "text/html"); conn.setRequestProperty("charset", "utf-8");
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                new InputStreamReader(myURL.openStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputLine = null;
        // Read the body of the response
        while (true) {
            try {
                if (!((inputLine = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(inputLine);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}