fun main(args: Array<String>) {
    changeValue()
}

/**
 * Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
 * A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
 * valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.
 */
fun changeValue() {
    var a = 10
    var b = 20

    var aux = a
    a = b
    b = aux

    println("Valor A: $a, Valor B: $b")
}