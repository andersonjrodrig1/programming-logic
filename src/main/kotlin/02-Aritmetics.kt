fun main(args: Array<String>) {
    //predecessor()
    //areaRectangle()
    //calculateDaysOfLife()
    calculateSalaryEmployer()
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
fun calculateVotes() {
    print("Numero de eleitores no município: ")
    val votesNumber = readLine()!!.toInt()
    print("Numero de votos brancos: ")
    val whiteVotes = readLine()!!.toInt()
    print("Numero de votos nulos: ")
    val nullVotes = readLine()!!.toInt()
    print("Numero de votos validos: ")
    val validVotes = readLine()!!.toInt()

    val percentWhite = (votesNumber * whiteVotes) / 100
    val percentNull = (votesNumber * nullVotes) / 100
    val percentValid = (votesNumber * validVotes) / 100

    println("Percentual Branco: $percentWhite%")
    println("Percentual Nulos: $percentNull%")
    println("Percentual Validos: $percentValid%")
}

/**
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 * Calcular e escrever o valor do novo salário
 */
fun calculateSalary() {
    print("Informe o salário: ")
    val salary = readLine()!!.toFloat()
    print("Informe percentual de reajuste: ")
    val percent = readLine()!!.toInt()

    val newSalary = salary + ((salary * percent) / 100)

    println("Novo Salário: $newSalary")
}

/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
 * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */
fun calculatePriceCar() {
    print("Valor de fábrica do veiculo: ")
    val price = readLine()!!.toFloat()

    val distributorValue = (price * 28) / 100
    val taxValue = (price * 45) / 100
    val costFinal = price + distributorValue + taxValue

    println("Custo final: $costFinal")
}

/**
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão
 * também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
 * o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro
 * vendido. Calcule e escreva o salário final do vendedor.
 */
fun calculateSalaryEmployer() {
    print("Informe numero de carros vendidos: ")
    val numberCars = readLine()!!.toInt()
    print("Informe valor total das vendas: ")
    val totalSales = readLine()!!.toFloat()
    print("Informe o salário: ")
    val salary = readLine()!!.toFloat()
    print("Informe o valor da comissão por venda: ")
    val commission = readLine()!!.toFloat()

    val totalSalary = salary + (numberCars * commission) + (totalSales * 0.05)

    println("Salario Final: $totalSalary")
}