package com.example.demo.service;

import com.example.demo.model.Album;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class HttpRequest1 {
    private static HttpURLConnection connection;                                                 //def connection

    public void httpCall(){
        //method1 java.net.HttpURLConnection

        BufferedReader reader;
        String line;
        // StringBuffer responeContent = new StringBuffer();                                       //upend each line and build our response content

     /*   try {
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");                     //def url, def API endpoint
            connection = (HttpURLConnection) url.openConnection();                                //opening connection to API endpoint

            //request setup
            connection.setRequestMethod("GET");                                                   //setup request method
            connection.setConnectTimeout(8000);                                                   //setup connection timeout(if after 5s connection is not successful it is cancel)
            connection.setReadTimeout(8000);                                                      //setup read timeout

            int status = connection.getResponseCode();                                            // response code for connection
            //System.out.println("status "+ status);// Test if it works
            //if status is not successfu
            if (status > 299) {                                                                   //when status is not within the range of you know 200, which means our connection has some problem
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));  //getting error message from endpoint
                while ((line = reader.readLine()) != null) {
                    responeContent.append(line);                                                  //response content from our input stream                }
                reader.close();                                                                   //and after the reading is complete close the reader
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));  //getinputStream from endpoint
                while ((line = reader.readLine()) != null) {
                    responeContent.append(line);
                }
                reader.close();
            }
            //System.out.println(responeContent.toString());                                       //converting the string buffer to String and print that out
            parse(responeContent.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();                                                                //disconnect at the end
        }
    }
*/
        // java.net.http.HttpClient
        HttpClient client = HttpClient.newHttpClient();//build client
        java.net.http.HttpRequest request= java.net.http.HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();//create request
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()) //sending request using client, sincAsync-sending asynchronously,he second parameter
                // here means that we would tell the server we want to receive this response body as a string
                //  async method will return a complete go future type data type
                .thenApply(HttpResponse::body)                         //apply this method to the previous  results  and this double colon sign means this is a lambda expression it, means that we want to use the body method from the HTTP response class
                //.thenAccept(System.out::println)
                .thenApply(HttpRequest1::parse)

                .join();                                              //join must be put, otherwise it would not display anything
        //send request using client.async sending request

    }
    public static String parse(String responseBody){
        JSONArray albums = new JSONArray(responseBody);

        for (int i = 0; i < albums.length(); i++) {
            JSONObject album = albums.getJSONObject(i);
            int id = album.getInt("id");
            int userId = album.getInt("userId");
            String title = album.getString("title");
            System.out.println(i + " " + title + " " + userId);

        }
        return null;
}
}

