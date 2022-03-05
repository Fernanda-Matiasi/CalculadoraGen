/*
    Função com retorno!!
 */

fun main(){

    print("Qual operação você deseja realizar?" +
            "\n1)Adição \n2)Subtração \n3)Multiplicação \n4)Divisão" +
            "\nDigite o número da opição escolhida: ")

    val esco = readLine()!!.toInt()
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()


    if (esco == 1){
        soma(esco)

    }else if (esco == 2){
        sub(esco)

    }else if (esco == 3){
        mult(esco)

    }else if (esco == 4){
        div(esco)

    }
}

fun soma (num1: Int, num2: Int): Int{

    val calc = num1 + num2
    soma(calc)
    return calc
}

fun sub (num1: Int, num2: Int): Int{

    val calc = num1 - num2
    sub(calc)
    return calc
}

fun mult (num1: Int, num2: Int): Int{

    val calc = num1 * num2
    mult(calc)
    return calc
}

fun div (num1: Int, num2: Int): Int{

    val calc = num1 / num2
    div(calc)
    return calc
}