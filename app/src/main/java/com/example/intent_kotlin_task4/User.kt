package com.example.intent_kotlin_task4

import java.io.Serializable

class User(val name: String, val age: String): Serializable {
    override fun toString(): String {
        return "$name : $age"
    }
}