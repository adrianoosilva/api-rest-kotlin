package com.base.api.controller

import com.base.api.entity.Payment
import com.base.api.service.PaymentService
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/payment")
class PaymentController(val paymentService: PaymentService) {

    @PostMapping
    fun createPayment(@RequestBody payment: Payment) = paymentService.createPayment(payment)

    @GetMapping("/{value}")
    fun getPayment(@PathVariable value: BigDecimal) = paymentService.getPayment(value)

    @GetMapping
    fun getAllPayments() = paymentService.getAllPayments()


}