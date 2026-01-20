package com.dryedson.execicioheranca.veiculo

class Carro (

    nome: String, qtdRodas: Int, Status: Status): Veiculo(nome, qtdRodas) {


    override fun acelerar(): String {
        return "acelerando meu carro $nome com $qtdRodas rodas"
    }

    override fun acelerar(velocidade: Int) {
        println("acelerando meu carro $nome com $qtdRodas rodas a $velocidade km/h")
    }
    companion object {
        fun exibeMensagemVelocidadeMaximaLei() {
            println("A velocidade máxima permitida é de 80km/h")
        }
    }

}