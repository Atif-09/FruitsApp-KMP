package api

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import model.FruitsDataClassItem


class ApiClass {

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

   suspend fun githubUsers(): List<FruitsDataClassItem>{
        val response = client.get("https://www.fruityvice.com/api/fruit/all")
       return response.body()
    }


}