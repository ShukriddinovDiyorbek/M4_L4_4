package com.example.intent_kotlin_task4

import java.io.Serializable

class Member(val kotlin: String, val java: String): Serializable {
    override fun toString(): String {
        return "$kotlin : $java"
    }
}