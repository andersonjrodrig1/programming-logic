fun main(args: Array<String>) {
    //predecessor()
    //areaRectangle()
    calculateDaysOfLife()
}

/**
 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 */
fun predecessor() {
    print("Informe um número: ")
    var number = readLine()!!.toInt()

    println("Antecessor: ${--number}")
}

/**
 * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo
 */
fun areaRectangle() {
    print("Informe a base do retangulo: ")
    val base = readLine()!!.toInt()
    print("Informe a altura do retangulo: ")
    val heigh = readLine()!!.toInt()

    println("Área do Triangulo: ${base * heigh}")
}

/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
 * dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
fun calculateDaysOfLife() {
    println("Informe sua idade (anos, meses e dias)")
    print("Anos: ")
    val yearsOld = readLine()!!.toInt()
    print("Meses: ")
    val months = readLine()!!.toInt()
    print("Dias: ")
    val days = readLine()!!.toInt()

    val daysOfLife = ((yearsOld * 365) + (months * 30) + days)

    println("Dias de vida: $daysOfLife")
}

/**
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
 * nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */