package com.example.kotlinlibraytest

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        println("test ios example")
        println(Greeting().greet())
        assertTrue(Greeting().greet().contains("iOS"), "Check iOS is mentioned")
    }
}