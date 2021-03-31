package br.com.zup.autores

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface AutorRepository : JpaRepository<Autor, Long> {

    fun findByEmail(email: String) : Optional<Autor>

//    @Query("SELECT a FROM Autor a Where a.email = :email")
//    fun buscaPorEmail(email: String) : Optional<Autor>
}