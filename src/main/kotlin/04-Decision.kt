fun main(args: Array<String>) {
    //verifyLargeAndSmaller()
    //verifyPositiveOrNegative()

    accountBankValue()
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

/**
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá
 * hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
 * de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido
 * das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */
fun salaryEmployer() {
    print("Informe o número de horas trabalhadas no mês: ")
    val workHours = readLine()!!.toFloat()
    print("Informe o salário por hora trabalhada: ")
    val valueWorkHour = readLine()!!.toFloat()

    val totalSalary = if (workHours > 40) {
        val qtyExtraHour = workHours - 40
        (qtyExtraHour * (valueWorkHour * 0.50f)) + valueWorkHour * 40
    } else
        valueWorkHour * workHours

    println("Salário total: $totalSalary")
}

/**
 * Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu peso ideal,
 * utilizando as seguintes fórmulas:
 * - para sexo masculino: peso ideal = (72.7 * altura) - 58
 * - para sexo feminino: peso ideal = (62.1 * altura) - 44.7
 */
fun calculateMdc() {
    print("Informe o seu nome: ")
    val name = readLine()
    print("Informe a altura: ")
    val heigth = readLine()!!.toFloat()
    print("Infrome o sexo(M ou F): ")
    val gender = readLine()

    val weight = if (gender == "M")
        (72.7 * heigth) - 58
    else
        (62.1 * heigth) - 44.7

    println("Peso ideal: $weight")
}

/**
 * Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
 * comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e
 * escrever o seu salário total.
 */
fun calculateCommision() {
    print("Informe o salário fixo: ")
    val salary = readLine()!!.toFloat()
    print("Informe o valor das vendas: ")
    val sale = readLine()!!.toFloat()

    var totalSalary = 0f

    if (sale > 1500)
        totalSalary = ((sale - 1500) * 0.05f)

    totalSalary += ((1500 * 0.03f) + salary)

    println("Total salário: $totalSalary")
}

/**
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o
 * saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero
 * escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */
fun accountBankValue() {
    print("Informe o numero da conta: ")
    val accountNumber = readLine()
    print("Informe o saldo: ")
    val balance = readLine()!!.toFloat()
    print("Informe o valor de debito: ")
    val debitValue = readLine()!!.toFloat()
    print("Informe o valor de credito: ")
    val creditValue = readLine()!!.toFloat()

    val totalBalance = balance - debitValue + creditValue

    when {
        totalBalance >= 0 -> println("Saldo Positivo")
        else -> println("Saldo Negativo")
    }
}

/**
 * Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
 * de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
 * Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
 * senão escrever a mensagem 'Efetuar compra'.
 */
fun calculateStock() {
    print("Informe quantidade em estoque: ")
    val actualyStock = readLine()!!.toInt()
    print("Informe quantidade mínima em estoque: ")
    val minStock = readLine()!!.toInt()
    print("Informe quantidade maxima em estoque: ")
    val maxStock = readLine()!!.toInt()

    val averageStock = (minStock + maxStock) / 2f

    when {
        actualyStock >= averageStock -> println("Não efetuar compra")
        else -> println("Efetuar compra")
    }
}