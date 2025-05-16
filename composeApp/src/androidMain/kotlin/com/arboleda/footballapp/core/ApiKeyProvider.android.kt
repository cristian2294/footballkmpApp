package com.arboleda.footballapp.core

import com.arboleda.footballapp.BuildConfig

actual object ApiKeyProvider {
    actual fun getApiKey(): String = BuildConfig.API_KEY
}
