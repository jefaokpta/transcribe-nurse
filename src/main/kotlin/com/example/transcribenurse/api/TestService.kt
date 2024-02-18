package com.example.transcribenurse.api

import org.springframework.stereotype.Service

@Service
class TestService {
    private var number = 10

    fun getNumber(): String {
        number++
        return number.toString()
    }
}