package br.com.zup.autores

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Autor(
    val nome: String,
    val email: String,
    var descricao: String,
    @field:Embedded val endereco: Endereco
) {

    @Id
    @GeneratedValue
    var id: Long? = null

    @Column(updatable = false)
    val criadoEm: LocalDateTime = LocalDateTime.now()

}
