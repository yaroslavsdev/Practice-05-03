package ru.tbank.education.school.lesson7.seminar.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ru.tbank.education.school.lesson7.seminar.model.OrderItem
import ru.tbank.education.school.lesson7.seminar.model.OrderStatus
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
 * @param id 
 * @param customerEmail 
 * @param deliveryAddress 
 * @param items 
 * @param totalAmount 
 * @param status 
 */
data class Order(

    @get:Min(1L)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @get:Email
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("customerEmail", required = true) val customerEmail: kotlin.String,

    @get:Size(min=1,max=200)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("deliveryAddress", required = true) val deliveryAddress: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrderItem>,

    @get:DecimalMin("0.01")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("totalAmount", required = true) val totalAmount: kotlin.Double,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: OrderStatus
) {

}

