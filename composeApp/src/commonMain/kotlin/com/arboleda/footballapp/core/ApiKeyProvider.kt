package com.arboleda.footballapp.core

expect object ApiKeyProvider {
    fun getApiKey(): String
}
