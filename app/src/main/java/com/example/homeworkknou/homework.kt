package com.example.homeworkknou

fun main(args: Array<String>){
    for (x in 1..9)
        for(y in 1..9)
            if(y !== 9) {
                print("$x * $y = ${x * y} 이 맞다")
            } else {
                println("$x * $y = ${x * y} 이 맞다")
            }
}

