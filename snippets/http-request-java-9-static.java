import java.net.*
import jdk.incubator.http.*

URI uri = new URI("http://keyrus.com.br")

HttpClient httpClient = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString())

System.out.println("http version: " + response.version())
System.out.println("status code: " + response.statusCode())
System.out.println("content: " + response.body())
