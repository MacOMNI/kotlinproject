package com.example.kotlinlibraytest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform