package com.example.diceroller

class Dice(var numSides: Int = 6){

    fun roll(): Int {
        var resultRange = 1..numSides
        return resultRange.random()
    }
}