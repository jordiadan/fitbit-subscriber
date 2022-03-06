package com.example.fitbitsubscriber.infrastructure.configuration

import com.example.fitbitsubscriber.domain.FitbitRepository
import com.example.fitbitsubscriber.infrastructure.repository.FeignClientFitbitRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InfrastructureConfiguration {

    @Bean
    fun getFitbitRepository(): FitbitRepository = FeignClientFitbitRepository()

}