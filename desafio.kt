package com.example.aprenda_kotlin_com_exemplos_lab

    // [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

    enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

    class Usuario (val nome: String) {
        override fun toString(): String {
            return nome
        }
    }

    data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel){
        //val listaConteudo = mutableListOf<ConteudoEducacional>()
    }
    data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) { }

    data class Matricula(val usuario: Usuario, var formacao: Formacao){
        val inscritos = mutableListOf<Matricula>()

        fun matricular(matricula: Matricula) {
            inscritos.add(matricula)
        }
        
        fun inscritos(): List<Matricula>{
            return inscritos
        }
    }

    fun main() {
        //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")

        //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
        //val nivel = Nivel.BASICO
        val usuario = Usuario("Edmundo")
        val usuario2 = Usuario("Fulano")
        val conteudo1 = ConteudoEducacional("Koltin basico",nivel=Nivel.BASICO)
        val conteudo2 = ConteudoEducacional("Kotlin intermediario",120, Nivel.INTERMEDIARIO)
        val listaConteudo = mutableListOf<ConteudoEducacional>()
        listaConteudo.add(conteudo1)
        listaConteudo.add(conteudo2)
        val formacao1 = Formacao("Android Developer",listaConteudo)
        val matricula = Matricula(usuario,formacao1)
        val matricula2 = Matricula(usuario2,formacao1)
        var matricular = matricula.matricular(matricula)
        matricular = matricula.matricular(matricula2)
        val inscritos = matricula.inscritos
        for (alunosInscritos in inscritos) {                                   // 3
        println("Alunos matriculados: ${alunosInscritos}")
    }
       // println(inscritos)
    }