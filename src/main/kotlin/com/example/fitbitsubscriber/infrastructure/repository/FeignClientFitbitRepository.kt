package com.example.fitbitsubscriber.infrastructure.repository

import com.example.fitbitsubscriber.domain.FitbitRepository
import com.example.fitbitsubscriber.domain.Weight

class FeignClientFitbitRepository : FitbitRepository {

    override fun getWeightLog(userId: Int, date: String): Weight {
        return Weight(0.0)
    }

}
