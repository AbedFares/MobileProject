package com.example.sensingcrowd

class Task {
    var temperature = false
    var noise = false
    var limunosity = false
    var photo = false
    var urgent = false

    fun SetTemp( b: Boolean ){
        this.temperature = b
    }
    fun SetNoise( b: Boolean ){
        this.noise = b
    }
    fun SetLimunosity( b: Boolean ){
        this.limunosity = b
    }
    fun SetPhoto( b: Boolean ){
        this.photo = b
    }
    fun SetUrgent( b: Boolean ){
        this.urgent = b
    }


}