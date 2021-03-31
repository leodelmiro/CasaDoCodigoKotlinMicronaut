package br.com.zup.autores

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Autor(
    val nome: String,
    val email: String,
    var descricao: String
) {

    @Id
    @GeneratedValue
    var id: Long? = null

    @Column(updatable = false)
    val criadoEm: LocalDateTime = LocalDateTime.now()
}
