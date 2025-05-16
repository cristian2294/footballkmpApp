package com.arboleda.footballapp.di

import com.arboleda.footballapp.core.ApiKeyProvider
import com.arboleda.footballapp.core.Constants.BASE_URL
import com.arboleda.footballapp.core.Constants.NAME_HEADER_API_KEY
import io.ktor.client.HttpClient
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

val dataModule =
    module {
        single {
            HttpClient {
                install(ContentNegotiation) {
                    json(json = Json { ignoreUnknownKeys = true }, contentType = ContentType.Any)
                }
                install(DefaultRequest) {
                    url {
                        protocol = URLProtocol.HTTPS
                        host = BASE_URL
                    }
                    headers {
                        append(NAME_HEADER_API_KEY, ApiKeyProvider.getApiKey())
                    }
                }
            }
        }
    }
