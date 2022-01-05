package com.base.api.repository

import com.base.api.entity.Payment
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.math.BigDecimal

@Repository
interface PaymentRepository : ReactiveMongoRepository<Payment, Long> {

    fun findByValue(value: BigDecimal) : Mono<Payment>
}