package com.example.fitbitsubscriber.application

import com.example.fitbitsubscriber.domain.FitbitRepository

class GetWeightFromFitbitUseCase(private val fitbitRepository: FitbitRepository) {

    fun execute(query: GetWeightFromFitbitQuery): Double {
        val weightLog = fitbitRepository.getWeightLog(query.userId, query.date)
        return weightLog.weight
    }
}