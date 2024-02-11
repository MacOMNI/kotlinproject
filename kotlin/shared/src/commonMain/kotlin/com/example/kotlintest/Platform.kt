package com.example.kotlintest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform