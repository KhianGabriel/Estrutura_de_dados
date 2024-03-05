fun main(args: Array<String>) {
    var pilha: DuplamenteEmpilhavel = PilhaEstaticaDupla(14)
    pilha.empilhar1("Instituto")
    pilha.empilhar1("Federal")
    println("Espiar:${pilha.topo1()}")
    pilha.empilhar2("Universidade")
    pilha.empilhar2("Estadual")
    pilha.empilhar1("de")
    pilha.empilhar1("Educação")
    println("Espiar:${pilha.topo2()}")
    pilha.empilhar2("do")
    pilha.empilhar1("Ciência")
    pilha.empilhar2("Rio")
    pilha.empilhar2("Grande")
    pilha.empilhar1("e")
    println("Espiar:${pilha.topo1()}")
    val conteudo1 = pilha.desempilhar1()
    pilha.desempilhar1()
    pilha.empilhar2("do")
    pilha.empilhar1("Tecnologia")
    pilha.empilhar1("da")
    println("Espiar:${pilha.topo2()}")
    val conteudo2 = pilha.desempilhar2()
    pilha.empilhar1("Bahia")
    pilha.empilhar1(pilha.desempilhar1())
    pilha.desempilhar2()
    pilha.empilhar2("Sul")
    pilha.empilhar1(conteudo1)
    pilha.empilhar2(pilha.desempilhar2())
    pilha.empilhar2(conteudo2)
    println("Pilha1=${pilha.imprimir1()}")
    println("Pilha2=${pilha.imprimir2()}")
}