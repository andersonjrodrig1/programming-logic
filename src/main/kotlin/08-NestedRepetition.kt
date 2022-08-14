fun main(args: Array<String>) {
    positionDraw()
}

/**
 * Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os números de 1 a 10.
 */
fun showMultiplicationTable() {
    for (i in 1 .. 10) {
        for (j in 1 .. 10)
            println("$i x $j = ${i * j}")

        println("")
    }
}

/**
 * Escreva um algoritmo que imprima as seguintes seqüências de números:
 * (1, 1 2 3 4 5 6 7 8 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10)
 * e assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 10.
 */
fun sequenceNumber() {
    for (i in 1 .. 10) {
        print("$i, ")

        for (j in 1 .. 10)
            print("$j ")

        println("")
    }
}

/**
 * Imagine que exista um comando chamado "posiciona (x,y)" em alguma linguagem de programação.
 * Onde o X representaria a coluna que algo deve ser impresso na tela, e Y a linha que algo deve ser impresso na tela.
 * Desta forma, o algoritmo abaixo:
 *                                  início
 *                                      posiciona (10,2)
 *                                      escrever ‘Olá’
 *                                  fim
 * Escreveria a palavra ‘Olá’ na segunda linha da tela, a partir da 10 coluna. Baseado nesta situação,
 * escreva um algoritmo, utilizando este comando 'posiciona' citado, que desenhe na tela um retângulo de 60 colunas
 * (a partir da coluna 1 da tela) e 10 linhas (a partir da linha 1 da tela), sendo que a borda deste retângulo será
 * formada pelo caractere ‘+’. Lembre que somente a primeira e última linha deverão ter todas as colunas preenchidas
 * com o caractere ‘+’. As demais linhas (entre 2 e 9) só terão as colunas 1 e 60 preenchidas.
 * A aparência deste retângulo deve ser parecida com a figura abaixo:
 */
fun positionDraw() {
    val first = 1
    val lines = 10
    val lastColumn = 60

    for (i in first .. lines) {
        for (j in first .. lastColumn) {
            when {
                ((i !in first +1 until lines) || (j == first) || (j == lastColumn)) -> print("+")
                else -> print(" ")
            }
        }
        println("")
    }
}