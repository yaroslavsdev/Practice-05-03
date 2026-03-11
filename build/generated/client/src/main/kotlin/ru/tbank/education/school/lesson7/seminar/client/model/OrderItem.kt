package ru.tbank.education.school.lesson7.seminar.client.model

import java.util.Objects
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
 * @param sku 
 * @param quantity 
 * @param price 
 * @param lineTotal 
 */
data class OrderItem(

    @get:Size(min=3,max=32)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sku", required = true) val sku: kotlin.String,

    @get:Min(1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("quantity", required = true) val quantity: kotlin.Int,

    @get:DecimalMin("0.01")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("price", required = true) val price: kotlin.Double,

    @get:DecimalMin("0.01")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("lineTotal", required = true) val lineTotal: kotlin.Double
) {

}

