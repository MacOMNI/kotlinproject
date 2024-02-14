package com.example.kotlin_libary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform