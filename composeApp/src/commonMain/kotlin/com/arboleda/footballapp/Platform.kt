package com.arboleda.footballapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform