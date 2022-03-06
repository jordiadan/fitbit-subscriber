package com.example.fitbitsubscriber.infrastructure.configuration

import com.example.fitbitsubscriber.application.GetWeightFromFitbitUseCase
import com.example.fitbitsubscriber.domain.FitbitRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun getWeightFromFitbitUseCase(fitbitRepository: FitbitRepository): GetWeightFromFitbitUseCase =
        GetWeightFromFitbitUseCase(fitbitRepository)

}