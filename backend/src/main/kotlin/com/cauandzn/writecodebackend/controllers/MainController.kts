package com.cauandzn.writecodebackend.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/comidas")
class ComidaController {

    @GetMapping
    fun listarComidas(): List<String> {
        return listOf("Comida1", "Comida2", "Comida3")
    }
}
