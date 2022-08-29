import java.util.Vector

fun main(args: Array<String>) {
    verifyRepeatedNumber()
}

fun vector() {
    val vector = intArrayOf(5, 1, 4, 2, 7, 8, 3, 6)

    for (i in vector.size - 1 downTo 5 step 1) {
        val aux = vector[i]
        vector[i] = vector[7 - i + 1]
        vector[7 - i + 1] = aux
    }

    vector[3] = vector[1]
    vector[vector[3]] = vector[vector[2]]

    vector.forEach { print("$it ") }
}

/**
 * Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em um vetor.
 * Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI,
 * se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.
 */
fun searchName() {
    var names = emptyArray<String>()
    var count = 1

    do {
        print("Digite um nome: ")
        val name = readLine()!!

        names = names.plus(name)
        count++
    } while (count < 10)

    print("Pesquise um nome na lista: ")
    val name  = readLine()!!

    when {
        names.contains(name) -> println("ACHEI")
        else -> println("NAO ACHEI")
    }
}

/**
 * Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos.
 * Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média calculada.
 * Escrever a média da turma e o resultado da contagem.
 */
fun averageNotesStudents() {
    var notes = emptyArray<Int>()
    var count = 0
    var sum = 0

    while (count < 20) {
        print("Digite a nota: ")
        val note = readLine()!!.toInt()

        notes = notes.plus(note)
        sum += note
        count++
    }

    val average = sum / count
    val amount = notes.count { it > average }

    println("Media da turma: $average, Contagem alunos: $amount")
}

/**
 * Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do maior
 * elemento de Q e a respectiva posição que ele ocupa no vetor.
 */
fun biggerValueVector() {
    var vector = intArrayOf()
    var bigger = 0
    var position = 0
    var count = 0

    while (count < 20) {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        vector = vector.plus(number)

        if (number > bigger) {
            bigger = number
            position = count
        }

        count++
    }

    println("Maior elemento: $bigger")
    println("Posição do elemento: $position")
}

/**
 * O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor
 * e a respectiva posição dele nesse vetor.
 */
fun smallerValueVector() {
    var vector = intArrayOf()
    var smaller = 0
    var position = 0
    var count = 0

    while (count < 20) {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        vector = vector.plus(number)

        if (smaller == 0 || number < smaller) {
            smaller = number
            position = count
        }

        count++
    }

    println("Menor elemento: $smaller")
    println("Posição do elemento: $position")
}

/**
 * Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X.
 * Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
 * Logo após, imprimir o vetor M.
 */
fun multiplyElementsVector() {
    var vectorA = intArrayOf()
    var vectorD = intArrayOf()
    var count = 0

    while (count < 10) {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        vectorA = vectorA.plus(number)
        count++
    }

    print("Digite um valor: ")
    val x = readLine()!!.toInt()

    vectorA.forEach { vectorD = vectorD.plus(it * x) }

    vectorD.forEach { print("$it ") }
}

/**
 * Faça um algoritmo para ler 20 números e armazenar em um vetor. Após a leitura total dos 20 números,
 * o algoritmo deve escrever esses 20 números lidos na ordem inversa.
 */
fun invertVector() {
    val vector = Vector<Int>()

    for (i in 1 .. 20) {
        print("Digite um número: ")
        val number = readLine()!!.toInt()

        vector.addElement(number)
    }

    vector.reverse()

    vector.forEach { print("$it ") }
}

/**
 * Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores).
 * Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor Soma a soma
 * dos elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma.
 */
fun sumElementsVector() {
    val vectorA = Vector<Int>()
    val vectorB = Vector<Int>()
    val vectorC = Vector<Int>()

    print("Informe o tamanho do vetor: ")
    val size = readLine()!!.toInt()

    for (i in 1 .. size) {
        print("Informe valor para vetor A: ")
        val a = readLine()!!.toInt()
        print("Informe valor para vetor B: ")
        val b = readLine()!!.toInt()

        vectorA.addElement(a)
        vectorB.addElement(b)
    }

    for (i in 0 until size) {
        val sum = vectorA[i] + vectorB[i]
        vectorC.addElement(sum)
    }

    vectorC.forEach { print("$it ") }
}

/**
 * Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
 * Calcular e escrever:
 * a) Menor temperatura do ano
 * b) Maior temperatura do ano
 * c) Temperatura média anual
 * d) O número de dias no ano em que a temperatura foi inferior a média anual
 */
fun temperatureDaysOfYear() {
    val daysOfYear: Int = 10
    val vector = Vector<Float>()
    var smallerTemp = 0f
    var biggerTemp = 0f
    var downTempNumber = 0

    for (i in 1 .. daysOfYear) {
        print("Informe a temperatura: ")
        val temperature = readLine()!!.toFloat()

        if (temperature < smallerTemp || smallerTemp == 0f)
            smallerTemp = temperature

        if (temperature > biggerTemp || biggerTemp == 0f)
            biggerTemp = temperature

        vector.addElement(temperature)
    }

    val averageTemp = vector.average()

    vector.forEach {
        if (it < averageTemp)
            downTempNumber++
    }

    println("Menor temperatura do ano: $smallerTemp")
    println("Maior temperatura do ano: $biggerTemp")
    println("Temperatura média anual: $averageTemp")
    println("Número de dias que a temperatura foi inferior a média anual: $downTempNumber")
}

/**
 * Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo deve ordenar
 * os números no vetor em ordem crescente. Escrever o vetor ordenado.
 */
fun ascendingVector() {
    val vector = Vector<Int>()

    for (i in 1 .. 10) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        vector.addElement(number)
    }

    for (i in 0 until vector.size) {
        for (j in 0 until vector.size) {
            if (vector[j] > vector[i]) {
                val aux = vector[j]
                vector[j] = vector[i]
                vector[i] = aux
            }
        }
    }

    vector.forEach { print("$it ") }
}

/**
 * O mesmo exercício anterior, mas depois de ordenar os elementos do vetor em ordem crescente,
 * deve ser lido mais um número qualquer e inserir esse novo número na posição correta, ou seja,
 * mantendo a ordem crescente do vetor.
 */
fun ascendingVector2() {
    val vector = Vector<Int>()

    for (i in 1 .. 10) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        vector.addElement(number)
    }

    for (i in 0 until vector.size) {
        for (j in 0 until vector.size) {
            if (vector[j] > vector[i]) {
                val aux = vector[j]
                vector[j] = vector[i]
                vector[i] = aux
            }
        }
    }

    print("Informe outro número: ")
    val number = readLine()!!.toInt()

    for (i in 0 until vector.size) {
        if (number <= vector[i]) {
            vector.add(i, number)
            break
        }

        if (i == vector.size -1)
            vector.addElement(number)
    }

    vector.forEach { print("$it ") }
}

/**
 * Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número qualquer e
 * verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo vetor sem esse número.
 * (Considere que não haverão números repetidos no vetor).
 */
fun readNumberVector() {
    val vector = Vector<Int>()

    for (i in 1 .. 20) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        vector.addElement(number)
    }

    print("Informe outro número: ")
    val number = readLine()!!.toInt()

    if (vector.contains(number))
        vector.removeElement(number)

    vector.forEach { print("$it ") }
}

/**
 * Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada.
 * Calcular e escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.
 */
fun verifyPositionAndElement() {
    val vectorA = Vector<Int>()
    val vectorB = Vector<Int>()
    var count: Int = 0

    for (i in 1 .. 15) {
        print("Digite um número para A: ")
        val a = readLine()!!.toInt()
        print("Digite um número para B: ")
        val b = readLine()!!.toInt()

        vectorA.addElement(a)
        vectorB.addElement(b)
    }

    for (i in 0 until vectorA.size) {
        if (vectorA[i] == vectorB[i])
            count++
    }

    println("Quantidade de vezes que V1 e V2 possuem os mesmos números: $count")
}

/**
 * Faça um algoritmo para ler um vetor de 30 números. Após isto, ler mais um número qualquer,
 * calcular e escrever quantas vezes esse número aparece no vetor.
 */
fun calculatorAmountNumberVector() {
    val vector = Vector<Int>()
    var count: Int = 0

    for (i in 1 .. 30) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        vector.addElement(number)
    }

    print("Informe outro número: ")
    val number = readLine()!!.toInt()

    vector.forEach {
        if (it == number)
            count++
    }

    println("Quantas vezes $number aparece no vetor: $count")
}

/**
 * Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
 * existem números repetidos no vetor VET e em que posições se encontram.
 */
fun verifyRepeatedNumber() {
    val vet = Vector<Int>()
    val count: Int = 0

    for (i in 0 .. 9) {
        print("Informe um número: ")
        val number = readLine()!!.toInt()

        vet.add(i, number)
    }

    val list = vet.groupBy { it }.filter { it.value.count() > 1 }

    println("Numeros repetidos: ${list.size}")
    println("Posição dos números no vetor: ")

    for (i in 0 until vet.size) {
        if (list.containsKey(vet[i]))
            println("Position: $i, Valor: ${vet[i]}")
    }
}