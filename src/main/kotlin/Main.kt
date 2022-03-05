/*
    Função sem retorno!!
 */
fun main() {

   print("Qual operação você deseja realizar?" +
           "\n1)Adição \n2)Subtração \n3)Multiplicação \n4)Divisão" +
           "\nDigite o número da opição escolhida: ")
   val esco = readLine()!!.toInt()

   if (esco == 1){
      soma(esco)

   }else if (esco == 2){
       sub(esco)

   }else if (esco == 3){
       mult(esco)

   }else{
       div(esco)
   }

}

fun soma (esco: Int){
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()

    val soma = num1 + num2
    print("Este é o resultado de $num1 + $num2 = $soma")
}

fun sub (esco: Int){
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()

    val sub = num1 - num2
    print("Este é o resultado de $num1 - $num2 = $sub")
}

fun mult (esco: Int){
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()

    val mult = num1 * num2
    print("Este é o resultado de $num1 * $num2 = $mult")
}

fun div (esco: Int){
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()

    val div = num1 / num2
    print("Este é o resultado de $num1 / $num2 = $div")
}