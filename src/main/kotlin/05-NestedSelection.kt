fun main(args: Array<String>) {

}

/**
 * Ler um valor e escrever se é positivo, negativo ou zero.
 */
fun positiveOrNegative() {
    print("Informe um valor: ")
    val number = readLine()!!.toInt()

    when {
        number > 0 -> println("Positivo")
        number < 0 -> println("Negativo")
        else -> println("Zero")
    }
}

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
 */
fun largeValue() {
    print("Informe um valor: ")
    val numberOne = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberTwo = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberThree = readLine()!!.toInt()

    val largeValue = when {
        numberOne > numberTwo && numberOne > numberThree -> numberOne
        numberTwo > numberOne && numberTwo > numberThree -> numberTwo
        else -> numberThree
    }

    println("Maior deles: $largeValue")
}

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
 */
fun sumOfLarges() {
    print("Informe um valor: ")
    val numberOne = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberTwo = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberThree = readLine()!!.toInt()

    val sum = when {
        numberOne < numberTwo && numberOne < numberThree -> numberTwo + numberThree
        numberTwo < numberOne && numberTwo < numberThree -> numberOne + numberThree
        else -> numberOne + numberTwo
    }

    println("Soma dos 2 maiores: $sum")
}

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
 */
fun ascendingOrderNumber() {
    print("Informe um valor: ")
    val numberOne = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberTwo = readLine()!!.toInt()
    print("Informe um valor: ")
    val numberThree = readLine()!!.toInt()

    when {
        numberOne < numberTwo && numberOne < numberThree -> {
            if (numberTwo < numberThree)
                println("$numberOne, $numberTwo, $numberThree")
            else
                println("$numberOne, $numberThree, $numberTwo")
        }
        numberTwo < numberOne && numberTwo < numberThree -> {
            if (numberOne < numberThree)
                println("$numberTwo, $numberOne, $numberThree")
            else
                println("$numberTwo, $numberThree, $numberOne")
        }
        numberThree < numberOne && numberThree < numberTwo -> {
            if (numberOne < numberTwo)
                println("$numberThree, $numberOne, $numberTwo")
            else
                println("$numberThree, $numberTwo, $numberOne")
        }
    }
}

/**
 * Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
 * OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */
fun verifyTriangle() {
    print("Informe um valor: ")
    val a = readLine()!!.toInt()
    print("Informe um valor: ")
    val b = readLine()!!.toInt()
    print("Informe um valor: ")
    val c = readLine()!!.toInt()

    when {
        (a < (b + c)) && (b < (a + c)) && (c < (a + b)) ->
            println("É um triangulo")
        else ->
            println("Não é um triangulo")
    }
}

/**
 * Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor.
 * Caso não haja vencedor deverá ser impressa a palavra EMPATE.
 */
fun verifyTeamWin() {
    print("Informe o nome do time: ")
    val teamOne = readLine()
    print("Informe quantidade de gols marcados: ")
    val goalOne = readLine()!!.toInt()
    print("Informe o nome do time: ")
    val teamTwo = readLine()
    print("Informe quantidade de gols marcados: ")
    val goalTwo = readLine()!!.toInt()

    when {
        goalOne > goalTwo -> println("Vencedor: $teamOne")
        goalTwo > goalOne -> println("Vencedor: $teamTwo")
        else -> println("EMPATE")
    }
}

/**
 * Ler dois valores e imprimir uma das três mensagens a seguir:
 * ‘Números iguais’, caso os números sejam iguais
 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
 * ‘Segundo maior’, caso o segundo seja maior que o primeiro.
 */
fun verifyValues() {
    print("Informe um valor: ")
    val a = readLine()!!.toInt()
    print("Informe um valor: ")
    val b = readLine()!!.toInt()

    when {
        a > b -> println("Primeiro é maior")
        b > a -> println("Segundo é maior")
        else -> println("Números iguais")
    }
}

fun algorithmTest() {
    print("Informe um valor: ")
    val x = readLine()!!.toInt()
    print("Informe um valor: ")
    val y = readLine()!!.toInt()

    val z = (x * y) + 5

    when {
        z <= 0 -> println("A")
        z <= 100 -> println("B")
        else -> println("C")
    }
}

/**
 * A- Alcool: até 20 litros, desconto de 3% por litro, acima de 20 litros, desconto de 5% por litro
 * G- Gasolina: até 20 litros, desconto de 4% por litro, acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma:
 * A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina
 * é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
 */
fun calculatePriceFuel() {
    print("Informe tipo de combustível: ")
    val fuelType = readLine()
    print("Informe a quantidade: ")
    val quantity = readLine()!!.toFloat()

    val totalValue = when(fuelType) {
        "A" -> {
            if (quantity <= 20)
                (2.90f - (2.90f * 0.03)) * quantity
            else
                (2.90f - (2.90f * 0.05)) * quantity
        }
        else -> {
            if (quantity <= 20)
                (3.30f - (3.30f * 0.04)) * quantity
            else
                (3.30f - (3.30f * 0.06)) * quantity
        }
    }

    println("Total a pagar: $totalValue")
}

/**
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre
 * diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher
 * mais nova, e o produto das idades do homem mais novo com a mulher mais velha.
 */
fun verifyYearsOld() {
    print("Informe a idade de um homem: ")
    val manOne = readLine()!!.toInt()
    print("Informe a idade de um homem: ")
    val manTow = readLine()!!.toInt()
    print("Informe a idade de uma mulher: ")
    val womanOne = readLine()!!.toInt()
    print("Informe a idade de uma mulher: ")
    val womanTwo = readLine()!!.toInt()

    var sum: Int? = null
    var product: Int? = null

    when {
        manOne > manTow && womanOne > womanTwo -> {
            sum = manOne + womanTwo
            product = manTow * womanOne
        }
        manOne > manTow && womanTwo > womanOne -> {
            sum = manOne + womanOne
            product = manTow * womanTwo
        }
        manTow > manOne && womanOne > womanTwo -> {
            sum = manTow + womanTwo
            product = manOne * womanOne
        }
        manTow > manOne && womanTwo > womanOne -> {
            sum = manTow + womanOne
            product = manOne * womanTwo
        }
    }

    println("Soma: $sum")
    println("Produto: $product")
}

/**
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 *                  Até 5 Kg            Acima de 5 Kg
 *      Morango      R$ 2,50 por Kg      R$ 2,20 por Kg
 *      Maçã         R$ 1,80 por Kg      R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um
 * desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
 * quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
fun salesFruit() {
    print("Informe a quantidade de morangos: ")
    val strawberryWeight = readLine()!!.toFloat()
    print("Informe a quantidade de maça: ")
    val appleWeight = readLine()!!.toFloat()

    val strawberryValue = when {
        strawberryWeight > 5 -> strawberryWeight * 2.20f
        else -> strawberryWeight * 2.50f
    }

    val appleValue = when {
        appleWeight > 5 -> appleWeight * 1.50f
        else -> appleWeight * 1.80f
    }

    val totalValue = when {
        ((strawberryValue + appleValue) > 25.0f) || ((strawberryWeight + appleWeight > 8)) -> {
            val total = strawberryValue + appleValue
            val discount = total * 0.10f
            total - discount
        }
        else -> strawberryValue + appleValue
    }

    println("Valor a ser pago: $totalValue")
}

/**
 * Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código
 * armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’.
 * Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta
 * (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta,
 * deve ser mostrada a mensagem ‘Acesso permitido’.
 */
fun accessUser() {
    print("Informe o usuário: ")
    val user = readLine()

    when(user) {
        "1234" -> {
            print("Informe a senha: ")
            val pw = readLine()

            if (pw == "9999")
                print("Acesso permitido")
            else
                print("Senha incorreta!")
        }
        else -> print("Usuário inválido!")
    }
}