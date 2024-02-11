package com.example.kotlinlibraytest

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        println("test android example")
        println(Greeting().greet())
        assertTrue(Greeting().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}