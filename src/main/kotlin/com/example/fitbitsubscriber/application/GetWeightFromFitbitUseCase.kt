package com.example.fitbitsubscriber.application

import com.example.fitbitsubscriber.domain.FitbitRepository

class GetWeightFromFitbitUseCase(private val fitbitRepository: FitbitRepository) {

    fun execute(query: GetWeightFromFitbitQuery): Double {
        val weightLog = fitbitRepository.getWeightLog(query.userId, query.date)
        return weightLog.weight
    }

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }

    private fun customPrint(it: String) {
        TODO("Not yet implemented")
    }

    fun printNonNul(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printNonNl(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }
}