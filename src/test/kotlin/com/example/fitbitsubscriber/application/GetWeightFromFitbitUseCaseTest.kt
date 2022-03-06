package com.example.fitbitsubscriber.application

import com.example.fitbitsubscriber.domain.FitbitRepository
import com.example.fitbitsubscriber.domain.Weight
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.random.Random.Default.nextDouble

internal class GetWeightFromFitbitUseCaseTest {

    private lateinit var getWeightFromFitbitUseCase: GetWeightFromFitbitUseCase
    private lateinit var fitbitRepository: FitbitRepository

    @BeforeEach
    internal fun setUp() {
        fitbitRepository = mock(FitbitRepository::class.java)
        getWeightFromFitbitUseCase = GetWeightFromFitbitUseCase(fitbitRepository)
    }

    @Test
    fun `get weight from fitbit`() {

        // given I have a user-id
        //  and the user has registered his weight in fitbit before
        // when I ask about the weight of user-id
        // then I should have a weight

        val userId = 12345
        val date = "yyyy-MM-dd"
        val expectedWeight = nextDouble()
        val getWeightLogResponse = Weight(expectedWeight)

        `when`(fitbitRepository.getWeightLog(userId, date)).thenReturn(getWeightLogResponse)

        val getWeightFromFitbitQuery = GetWeightFromFitbitQuery(userId, date)

        val weight = getWeightFromFitbitUseCase.execute(getWeightFromFitbitQuery)

        assertThat(weight).isEqualTo(getWeightLogResponse.weight)

    }
}