import java.net.*
import jdk.incubator.http.*
import static jdk.incubator.http.HttpClient.newHttpClient
import static jdk.incubator.http.HttpRequest.newBuilder
import static jdk.incubator.http.HttpResponse.BodyHandler.asString

URI uri = new URI("http://keyrus.com.br")
HttpResponse<String> response = newHttpClient().
                                  send(newBuilder().uri(uri).GET().build(), asString())

System.out.println("http version: " + response.version())
System.out.println("status code: " + response.statusCode())
System.out.println("content: " + response.body())
