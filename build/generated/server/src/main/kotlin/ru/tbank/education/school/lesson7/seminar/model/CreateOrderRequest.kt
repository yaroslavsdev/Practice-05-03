package ru.tbank.education.school.lesson7.seminar.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ru.tbank.education.school.lesson7.seminar.model.OrderItemRequest
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
 * @param customerEmail 
 * @param deliveryAddress 
 * @param items 
 */
data class CreateOrderRequest(

    @get:Email
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("customerEmail", required = true) val customerEmail: kotlin.String,

    @get:Size(min=1,max=200)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("deliveryAddress", required = true) val deliveryAddress: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=20) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<OrderItemRequest>
) {

}

