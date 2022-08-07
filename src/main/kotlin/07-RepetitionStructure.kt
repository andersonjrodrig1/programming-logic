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

/**
 * Reescreva o exercício 50 utilizando a estrutura FAÇA, ENQUANTO e um CONTADOR.
 */
fun showNumbersDescend2() {
    var count = 1

    do {
        print("$count ")
        count++
    } while (count <= 10)
}

/**
 * Reescreva o exercício 51 utilizando a estrutura ENQUANTO e um CONTADOR.
 */
fun showNumbersDescend3() {
    var count = 1

    while (count <= 10) {
        print("$count ")
        count++
    }
}

/**
 * Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.
 */
fun countValuesNegatives() {
    var count = 1
    var countNegatives = 0

    while (count <= 10) {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        if (number < 0) countNegatives++

        count++
    }

    println("Quantidade de números negativos: $countNegatives")
}

/**
 * Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20]
 * (inlcuindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.
 */
fun countValuesInterval() {
    var count = 1
    var inInterval = 0
    var outInterval = 0

    while (count <= 10) {
        print("Digite um número: ")

        when(readLine()!!.toInt()) {
            in 10..20 -> inInterval++
            else -> outInterval++
        }

        count++
    }

    println("Dentro do intervalo: $inInterval")
    println("Fora do intervalo: $outInterval")
}

/**
 * Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.
 */
fun averageValues() {
    var sum = 0f
    var count = 1

    do {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        sum += number
        count++
    } while (count <= 10)

    val average = sum / count

    print("Média: $average")
}

/**
 * Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos,
 * calcular e escrever a média aritmética dessas notas lidas.
 */
fun averageNoteStudents() {
    print("Informe o número de alunos: ")
    val amount = readLine()!!.toInt()

    var sum = 0f

    for (i in 1..amount) {
        print("Informe a nota: ")
        val note = readLine()!!.toFloat()

        sum += note
    }

    val average = sum / amount

    print("Médias dos alunos: $average")
}

/**
 * Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.
 */
fun sumNumbers() {
    var sum = 0
    var count = 1

    while (count <= 10) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        sum += number
        count++
    }

    print("Soma dos números: $sum")
}

/**
 * Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados.
 * Escreva o valor final da soma efetuada.
 */
fun sumNumberSmallerForty() {
    var sum = 0
    var count = 1

    while (count <= 10) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        if (number < 40)
            sum += number

        count++
    }

    print("Soma dos números: $sum")
}

/**
 * Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos
 * (incluindoos valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
 */
fun sumIntervalNumbers() {
    print("Informe um número: ")
    val initalNumber = readLine()!!.toInt()
    print("Informe outro número: ")
    val finalNumber = readLine()!!.toInt()

    var sum = 0

    for (i in  initalNumber..finalNumber)
        sum += i

    println("Somas do números do intervalo: $sum")
}

/**
 * O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou menor
 * que o primeiro valor lido, ou seja, deve-se testá-los.
 */
fun sumIntervalNumber2() {
    print("Informe um número: ")
    var initalNumber = readLine()!!.toInt()
    print("Informe outro número: ")
    var finalNumber = readLine()!!.toInt()

    var aux = 0
    var sum = 0

    if (finalNumber < initalNumber) {
        aux = finalNumber
        finalNumber = initalNumber
        initalNumber = aux
    }

    for (i in  initalNumber..finalNumber)
        sum += i

    println("Somas do números do intervalo: $sum")
}

/**
 * Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15
 * (inclusive) e 100 (inclusive).
 */
fun averageBetweenNumbers() {
    var sum = 0
    var count = 0
    val inital = 15
    val final = 100

    for (i in inital .. final) {
        count++
        sum += i
    }

    val average = sum / count

    println("Média dos números entre $inital e $final é $average")
}

/**
 * Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita
 * a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o valor de cada mercadoria.
 * Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 */
fun averageProductsInInvestory() {
    print("Informe total de mercadorias em estoque: ")
    val totalInvestory = readLine()!!.toInt()

    var sum = 0f

    for (i in 1 .. totalInvestory) {
        print("Informe o valor da mercadoria: ")
        val value = readLine()!!.toFloat()

        sum += value
    }

    val average = sum / totalInvestory

    println("Valor total em estoque: $sum")
    println("Média de valor das mercadorias: $average")
}

/**
 * O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. Então o funcionamento
 * deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. Ao final,
 * imprimir o valor total em estoque e a média de valor das mercadorias em estoque.
 */
fun averageProductsInInvestory2() {
    var sum = 0f
    var count = 0
    var option: String

    do {
        print("Informe o valor da mercadoria: ")
        val value = readLine()!!.toFloat()

        sum += value
        count++

        print("MAIS MERCADORIAS (S/N)? ")
        option = readLine()!!
    } while(option.uppercase() == "S")

    val average = sum / count

    println("Valor total em estoque: $sum")
    println("Média de valor das mercadorias: $average")
}