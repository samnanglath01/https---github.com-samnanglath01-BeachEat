package com.BeactEat.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class BeachEatApplication

fun main(args: Array<String>) {
	runApplication<BeachEatApplication>(*args)
}
