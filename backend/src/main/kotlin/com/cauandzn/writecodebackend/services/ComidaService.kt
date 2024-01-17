package com.cauandzn.writecodebackend.services

import com.cauandzn.writecodebackend.entities.Comida
import com.cauandzn.writecodebackend.repositories.ComidaRepository
import org.springframework.stereotype.Service

@Service
class ComidaService(private val comidaRepository: ComidaRepository) {

    fun listarComidas(): List<Comida> {
        return comidaRepository.findAll()
    }

    fun salvarComida(comida: Comida): Comida {
        return comidaRepository.save(comida)
    }

}
