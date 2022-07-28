fun main(args: Array<String>) {

}

/**
 * Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor,
 * ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro
 * valor lido pelo segundo valor lido.
 * Acrescentar uma mensagem de 'VALOR INVÁLIDO' caso o segundo valor informado seja ZERO.
 */
fun readTwoValues() {
    print("Informe um valor: ")
    val number1 = readLine()!!.toInt()
    var number2: Int? = null

    do {
        print("Informe outro valor: ")
        number2 = readLine()!!.toInt()

        if (number2 == 0)
            println("VALOR INVÀLIDO")
    } while (number2 == 0)

    val division = number1 / number2!!

    println("Divisão: $division")
}

/**
 * Reescreva o exercício anterior utilizando a estrutura ENQUANTO.
 * Acrescentar uma mensagem de 'VALOR INVÁLIDO' caso o segundo valor informado seja ZERO.
 */
fun readTwoValues2() {
    print("Informe um valor: ")
    val number1 = readLine()!!.toInt()
    print("Informe outro valor: ")
    var number2 = readLine()!!.toInt()

    while (number2 == 0) {
        println("VALOR INVÀLIDO")
        print("Informe outro valor: ")
        number2 = readLine()!!.toInt()
    }

    val division = number1 / number2!!

    println("Divisão: $division")
}

/**
 * Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples)
 * desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
 * Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e
 * executar um novo cálculo, caso contrário deverá encerrar o algoritmo
 */
fun notesEvaluation() {
    var note1: Float
    var note2: Float

    do {
        do {
            print("Nota 1° avaliação: ")
            note1 = readLine()!!.toFloat()
        } while (note1 < 0.0f || note1 > 10.0f)

        do {
            print("Nota 2° avaliação: ")
            note2 = readLine()!!.toFloat()
        } while (note2 < 0.0f || note2 > 10.0f)

        val average = (note1 + note2) / 2

        println("Média: $average")

        println("NOVO CALCULO (S/N)?")
        val option = readLine()
    } while (option?.uppercase() == "S")
}

/**
 * Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem crescente.
 */
fun showNumbersAscend() {
    for(i in 1..10)
        print("$i ")
}

/**
 * Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.
 */
fun showNumbersDescend() {
    for (i in 10 downTo 1)
        print("$i ")
}

/**
 * Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.
 */
fun showNumberBiggersHundred() {
    for(i in 101..110)
        print("$i ")
}

/**
 * Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
 * Considere que o N será sempre maior que ZERO.
 */
fun showIntervalNumbers() {
    print("Informe um número: ")
    val number = readLine()!!.toInt()

    for(i in 1..number)
        print("$i ")
}

/**
 * Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor informado
 * (para N) não seja maior que 0, deverá ser lido um novo valor para N.
 */
fun showIntervalNumbersTwo() {
    var number: Int

    do {
        print("Informe um número: ")
        number = readLine()!!.toInt()
    } while (number <= 0)

    for(i in 1..number)
        print("$i ")
}

/**
 * Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
 */
fun tableEight() {
    val eight = 8

    for (i in 1..10)
        println("$eight x $i = ${eight * i}")
}

/**
 * Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
 */
fun tableNumber() {
    var number: Int

    do {
        print("Informe um número: ")
        number = readLine()!!.toInt()
    } while (number <= 0 || number > 10)

    for (i in 1..10)
        println("$number x $i = ${number * i}")
}