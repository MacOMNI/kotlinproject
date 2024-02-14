package com.example.kotlin_libary

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        println("testExample")
        assertTrue(Greeting().greet().contains("Hello"), "Check 'Hello' is mentioned")
    }
}