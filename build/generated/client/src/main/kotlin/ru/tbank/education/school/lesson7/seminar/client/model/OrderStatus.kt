package ru.tbank.education.school.lesson7.seminar.client.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* 
* Values: nEW,cONFIRMED,cANCELLED
*/
enum class OrderStatus(val value: kotlin.String) {

    @JsonProperty("NEW") nEW("NEW"),
    @JsonProperty("CONFIRMED") cONFIRMED("CONFIRMED"),
    @JsonProperty("CANCELLED") cANCELLED("CANCELLED")
}

