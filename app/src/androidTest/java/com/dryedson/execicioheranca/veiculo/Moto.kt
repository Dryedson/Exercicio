package com.dryedson.execicioheranca.veiculo

class Moto(nome: String, qtdrodas: Int, funcionamento: Status) : Veiculo(nome, qtdrodas), Eletrificado {



   override fun acelerar() : String {
        return "Acelerando a moto $nome com $qtdRodas rodas"
    }

    override fun acelerar(velocidade: Int) {
        println("Acelerando a moto $nome com $qtdRodas rodas a $velocidade km/h")
    }


    override fun motorEletrico() {
        println("Moto $nome com motor elétrico")
    }

    companion object {
        fun exibeMensagemVelocidadeMaximaLei() {
            println("A velocidade máxima permitida é de 80km/h")
        }

    }
}


