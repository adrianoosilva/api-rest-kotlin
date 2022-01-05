package com.base.api.entity

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.time.LocalDateTime

@Document
class Payment {
        @Id
        var id: Long = 0
        lateinit var value: BigDecimal
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
        lateinit var dateTime: LocalDateTime
        var description: String? = null
}