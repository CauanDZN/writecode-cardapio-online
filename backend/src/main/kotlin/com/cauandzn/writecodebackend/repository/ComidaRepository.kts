package com.cauandzn.writecodebackend.repositories

import com.cauandzn.writecodebackend.entities.Comida
import org.springframework.data.jpa.repository.JpaRepository

interface ComidaRepository : JpaRepository<Comida, Long>
