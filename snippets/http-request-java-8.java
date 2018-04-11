import java.io.*;
import java.net.*;


URL url = new URL("http://www.keyrus.com.br/")
URLConnection urlConnection = url.openConnection();

BufferedReader reader = new BufferedReader(
  new InputStreamReader(urlConnection.getInputStream())
);

String line;

while((line = reader.readLine()) != null ) {
  System.out.println(line);
}

reader.close();
