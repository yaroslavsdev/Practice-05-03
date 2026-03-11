package ru.tbank.education.school.lesson7.seminar.client.api

import org.springframework.cloud.openfeign.FeignClient
import org.openapitools.configuration.ClientConfiguration

@FeignClient(
    name="\${orders.name:orders}",
    url="\${orders.url:http://localhost:8080}", 
    configuration = [ClientConfiguration::class]
)
interface OrdersApiClient : OrdersApi
