package br.com.devcapu.beehealthy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeeHealthyApplication

fun main(args: Array<String>) {
	runApplication<BeeHealthyApplication>(*args)
}