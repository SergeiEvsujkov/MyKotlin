package com.example.mykotlin

object Country {
    private const val country: String = "Russia"

    override fun toString(): String {
        return country
    }
    fun clone(): Any {
        return Country
    }
}