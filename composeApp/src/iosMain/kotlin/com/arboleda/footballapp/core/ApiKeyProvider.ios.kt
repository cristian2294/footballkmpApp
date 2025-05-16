package com.arboleda.footballapp.core

import platform.Foundation.NSBundle

actual object ApiKeyProvider {
    actual fun getApiKey(): String {
        val apiKey = NSBundle.mainBundle.infoDictionary?.get("API_KEY") as? String
        return apiKey ?: error("API Key not found in Info.plist or User-Defined Settings")
    }
}
