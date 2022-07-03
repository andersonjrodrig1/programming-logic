fun main(args: Array<String>) {
    //verifyLargeAndSmaller()
    //verifyPositiveOrNegative()

    calculateHours()
}

/**
 * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10,
 * caso contrário escrever NÃO É MAIOR QUE 10!
 */
fun verifyLargeAndSmaller() {
    print("Informe um número: ")
    val number = readLine()!!.toInt()

    if (number > 10)
        println("É MAIOR QUE 10!")
    else
        println("NÃO É MAIOR QUE 10!")
}

/**
 * Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
 */
fun verifyPositiveOrNegative() {
    print("Informe um número: ")
    val number = readLine()!!.toInt()

    if (number >= 0)
        println("Positivo")
    else
        println("Negativo")
}

/**
 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 */
fun priceApple() {
    print("Informe quantidade maçãs compradas: ")
    val quantity = readLine()!!.toInt()

    val valueTotal = if (quantity >= 12)
        quantity * 1.00f
    else
        quantity * 1.30f

    println("Custo total da compra: $valueTotal")
}

/**
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que
 * diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
 * Escrever também a média calculada.
 */
fun calculateEvaluation() {
    print("Nota da avaliação 1: ")
    val noteOne = readLine()!!.toFloat()
    print("Nota da avaliação 2: ")
    val noteTwo = readLine()!!.toFloat()

    val average = (noteOne + noteTwo) / 2

    if (average >= 6)
        println("Aluno aprovado!")
    else
        println("Aluno não aprovado!")
}

/**
 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá
 * ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
 */
fun verifyVote() {
    print("Informe o ano atual: ")
    val currentYear = readLine()!!.toInt()
    print("Informe o ano de nascimento: ")
    val birthYear = readLine()!!.toInt()

    val yearsOld = currentYear - birthYear

    if (yearsOld >= 18)
        println("Poderá votar este ano")
    else
        println("Não poderá votar este ano")
}

/**
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 */
fun largeNumber() {
    print("Informe um número: ")
    val numberOne = readLine()!!.toInt()
    print("Informe um número: ")
    val numberTwo = readLine()!!.toInt()

    val larger = if (numberOne > numberTwo) numberOne else numberTwo

    println("Maior: $larger")
}

/**
 * Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
 */
fun ascendingOrder() {
    print("Informe um número: ")
    val numberOne = readLine()!!.toInt()
    print("Informe um número: ")
    val numberTwo = readLine()!!.toInt()

    if (numberOne > numberTwo)
        println("$numberTwo, $numberOne")
    else
        println("$numberOne, $numberTwo")
}

/**
 * Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos)
 * e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e
 * que o jogo pode iniciar em um dia e terminar no dia seguinte.
 */
fun calculateHours() {
    print("Informe hora de inicio: ")
    val initial = readLine()!!.toInt()
    print("Informe hora final: ")
    val final = readLine()!!.toInt()

    val diff = if (final < initial)
        (24 - initial) + final
    else
        final - initial

    println("Duração do jogo: $diff horas")
}