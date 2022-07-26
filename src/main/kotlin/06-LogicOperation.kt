import java.time.LocalDateTime

fun main(args: Array<String>) {

}

/**
 * Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
 * Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar
 * (total a pagar = total - desconto), sabendo-se que:
 * - Se quantidade <= 5 o desconto será de 2%
 * - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 * - Se quantidade > 10 o desconto será de 5%
 */
fun calculateBuyProduct() {
    print("Nome do produto: ")
    val name = readLine()
    print("Quantidade: ")
    val amount = readLine()!!.toInt()
    print("Preço por unidade: ")
    val price = readLine()!!.toFloat()

    var total = amount * price

    val discount = when {
        amount > 10 -> total * 0.05f
        amount > 5 -> total * 0.03f
        else -> total * 0.02f
    }

    total -= discount

    println("Total a pagar: $total")
}

/**
 * Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem
 * parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de
 * acordo com a tabela de conceitos mais abaixo:
 *                                  N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
 * Média_de_Aproveitamento = ---------------------------------------------------------
 *                                                     7
 * A atribuição de conceitos obedece a tabela abaixo:
 *      Média de Aproveitamento         Conceito
 *          > = 9,0                     A
 *          > = 7,5 e < 9,0             B
 *          > = 6,0 e < 7,5             C
 *          < 6,0                       D
 */
fun calculateEvaluationNotes() {
    print("Nota 1: ")
    val note1 = readLine()!!.toFloat()
    print("Nota 2: ")
    val note2 = readLine()!!.toFloat()
    print("Nota 3: ")
    val note3 = readLine()!!.toFloat()
    print("Média dos exercícios: ")
    val averageExerc = readLine()!!.toFloat()

    val averageGeneral = (note1 + (note2 * 2) + (note3 * 3) + averageExerc) / 7

    when {
        averageGeneral >= 9 -> println("A")
        averageGeneral >= 7.5 -> println("B")
        averageGeneral >= 6 -> println("C")
        else -> println("D")
    }
}

/**
 * Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
 * Paraestar em condições, um dos seguintes requisitos deve ser satisfeito:
 * - Ter no mínimo 65 anos de idade.
 * - Ter trabalhado no mínimo 30 anos.
 * - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
 * Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código),
 * o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e
 * o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 */
fun verifyRetirement() {
    print("Número do empregado: ")
    val employerNumber = readLine()
    print("Ano de nascimento: ")
    val birthYear = readLine()!!.toInt()
    print("Ano de ingresso na empresa: ")
    val workYear = readLine()!!.toInt()

    val yearsOld = LocalDateTime.now().year - birthYear
    val timeWork = LocalDateTime.now().year - workYear

    val descritionRetirement = when {
        (yearsOld >= 65) || (timeWork >= 30) || (yearsOld >= 60 && timeWork >= 25) -> "Requerer aposentadoria"
        else -> "Não requerer"
    }

    println("Idade: $yearsOld, tempo de trabalho: $timeWork, $descritionRetirement")
}