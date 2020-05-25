package com.colamooon.kotlin.event

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class EventApplication

fun main(args: Array<String>) {
    runApplication<EventApplication>(*args)
}
