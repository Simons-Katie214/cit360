package urlhttpconnection;

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class URLhttpConnection {
    private static Scanner in;
    public static void main (String args[]) throws Exception {
		
    // Get URL that is being connected to.
        in = new Scanner(System.in);
        String siteName = null;
        System.out.println("Enter in the site you'd like to go to, make sure you "
                + "use 'www.' and '.com' when entering the site name.");
        siteName = in.next();
		
    //connect to the url.
	URL myWebPage = new URL("http://" + siteName);
        HttpURLConnection showMe = (HttpURLConnection) myWebPage.openConnection();
        
    // bufferedReader
        BufferedReader OneMoment = new BufferedReader(new InputStreamReader(showMe.getInputStream()));
        
    //output
        String httpUrl;
        while((httpUrl = OneMoment.readLine()) != null){
            //System.out.println(httpUrl);
            if (httpUrl.isEmpty() != true){
                System.out.println(httpUrl);
            } else {
                System.out.println("Nothing to see here");
            }
        }
		
        OneMoment.close();
    }    
}