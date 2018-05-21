/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;        
        /**
         *
         * @author mikeg
         */

public class HttpURLConnection {

    public static void main(String[] args) {

        // This is the url that the program will connect to.
        String output = getUrlContents("https://www.jerky.com");

        //This is the actual output. It will print out the html file for the url provided above.
        System.out.println(output);

    }

    private static String getUrlContents(String theUrl) {

        // Try/catch statement to catch an exceptions being thrown. 
        StringBuilder content = new StringBuilder();

        try {

            //URL object.
            URL url = new URL(theUrl);

            //URLConnection object
            URLConnection urlConnection = url.openConnection();

            try ( //BufferedReader object.
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                String line;
                
                // Read from the urlconnection through bufferedreader.
                while ((line = bufferedReader.readLine()) != null) {
                    
                    content.append(line).append("\n");
                    
                }
            }

        } catch (IOException e) {
        }

        return content.toString();
    }
}
