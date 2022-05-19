fun main(args: Array<String>) {
    println("Digite o primeiro número: ")
    val X = readln().toInt()
    println("Digite o segundo número: ")
    val Y = readln().toInt()
    val resultado = soma(X,Y)
    println("O resultado da soma entre $X e $Y é: $resultado")


}
fun soma(x:Int, y:Int)= x+y
fun multiplicacao(x:Int, y:Int)=x*y
fun divisao(x:Int, y:Int)= x/y
fun subtracao(x:Int, y:Int)=x-y