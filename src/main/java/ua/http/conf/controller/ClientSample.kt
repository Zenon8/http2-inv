package ua.http.conf.controller

import jdk.incubator.http.HttpClient
import jdk.incubator.http.HttpRequest
import jdk.incubator.http.HttpResponse
import java.net.URI

class HttpClientSample {
    val client:HttpClient = HttpClient.newHttpClient()

    val client1:HttpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build()

    val request: HttpRequest = HttpRequest.newBuilder()
            .uri(URI("http:/google.com.ua"))
            .GET()
            .build()

    val response:HttpResponse<String> = client.send(request, HttpResponse.BodyHandler.asString())
}

