package br.com.devcapu.beehealthy.controller

import br.com.devcapu.beehealthy.domain.model.BMI
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class PatientController {

    @GetMapping
    fun example() = "Hello World!"
}