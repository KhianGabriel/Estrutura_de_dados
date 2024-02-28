fun main(args: Array<String>) {

  var pilha = PilhaEstatica()
  
  pilha.empilhar("Instituto")
  pilha.empilhar("Federal")
  println("Topo: ${pilha.topo()}")
  pilha.empilhar("de")
  pilha.empilhar("Educação")
  
}