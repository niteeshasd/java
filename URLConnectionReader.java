import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.io.*;

public class URLConnectionReader {
    public static String getText(String url) throws Exception {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
        	System.out.println(inputLine);
            //response.append(inputLine);

        in.close();

        return response.toString();
    }

    public static void main(String[] args) throws Exception {
        String content = URLConnectionReader.getText("http://cs.leanderisd.org/txt/fake-addresses.txt");
//        System.out.println(content);
        
        
       /* String content1 = URLConnectionReader.getUrl("http://cs.leanderisd.org/txt/fake-addresses.txt");
         System.out.println(content1);*/
    }
    
    
    
    
    private static String getUrl(String aUrl) throws MalformedURLException, IOException
    {
        String urlData = "";
        URL urlObj = new URL(aUrl);
      /*  URLConnection conn = urlObj.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) */
//        URLConnection conn = urlObj.openConnection();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream(), StandardCharsets.UTF_8))) 
        
        
        {
            urlData = reader.lines().collect(Collectors.joining("\n"));
        }
        return urlData;
    }
    
}
	
