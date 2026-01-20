package com.dryedson.execicioheranca.veiculo

open abstract class Veiculo(
    var nome: String = "",
    var qtdRodas: Int = 0,
    var status: Status = Status.FUNCIONAMENTO
) {

    enum class Status(){
        MANUTENCAO,
        FUNCIONAMENTO,
        QUEBRADO,

    }




    abstract fun acelerar(): String

    abstract fun acelerar(velocidade: Int)
}

fun main(){

    val carro = Carro("Fusca", 4 , Veiculo.Status.FUNCIONAMENTO)
    carro.acelerar()
    carro.acelerar(100)


    val moto = Moto("strada", 2, Veiculo.Status.FUNCIONAMENTO)
    moto.acelerar()
    moto.acelerar(60)
    moto.motorEletrico()
}


