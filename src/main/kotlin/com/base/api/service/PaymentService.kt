package com.base.api.service

import com.base.api.entity.Payment
import com.base.api.repository.PaymentRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.math.BigDecimal

@Service
class PaymentService(val repository: PaymentRepository) {

    fun createPayment(payment: Payment) = repository.save(payment)

    fun getPayment(value: BigDecimal)  = repository.findByValue(value)

    fun getAllPayments() = repository.findAll()


}