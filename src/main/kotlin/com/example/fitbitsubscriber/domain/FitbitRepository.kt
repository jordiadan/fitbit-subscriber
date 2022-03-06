package com.example.fitbitsubscriber.domain

interface FitbitRepository {

    fun getWeightLog(userId: Int, date: String): Weight

}
