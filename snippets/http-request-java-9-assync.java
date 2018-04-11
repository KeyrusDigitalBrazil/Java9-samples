import java.net.*
import java.util.concurrent.*
import jdk.incubator.http.*
import static jdk.incubator.http.HttpClient.newHttpClient
import static jdk.incubator.http.HttpRequest.newBuilder
import static jdk.incubator.http.HttpResponse.BodyHandler.asString

URI uri = new URI("https://www.google.com.br")
CompletableFuture<HttpResponse<String>> response =
            newHttpClient().sendAsync(newBuilder().uri(uri).GET().build(), asString())

response.whenComplete( (r, t) -> System.out.println(r.body()) )
