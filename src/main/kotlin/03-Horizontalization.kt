fun main(args: Array<String>) {
    //convertFahrenheitToCelsius()
    weightedAverage()
}

/**
 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit,
 * calcular e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
 *                                      C          F - 32
 *                                  ---------- = -----------
 *                                      5            9
 */
fun convertFahrenheitToCelsius() {
    print("Informe a temperatura em Fahrenheit: ")
    val tempeture = readLine()!!.toFloat()

    val celsius = ((tempeture - 32) / 9) * 5

    println("Celsius: $celsius")
}

/**
 * Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
 * Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é:
 *                                                 n1 * 2 + n2 * 3 + n3 * 5
 *                                mediafinal = -----------------------------------
 *                                                            10
 */
fun weightedAverage() {
    print("Informe a nota 1: ")
    val noteOne = readLine()!!.toInt()
    print("Informe a nota 2: ")
    val noteTwo = readLine()!!.toInt()
    print("Informe a nota 3: ")
    val noteThree = readLine()!!.toInt()

    val average = ((noteOne * 2) + (noteTwo * 3) + (noteThree * 5)) / 10

    println("Média final: $average")
}