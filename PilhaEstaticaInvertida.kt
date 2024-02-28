class PilhaEstaticaInvertida : Empilhavel {

    private var ponteiroTopo: Int
    private var dados: Array<Any?>
    //contrutores
    constructor():this(10){}
    
    constructor(tamanho: Int){
        ponteiroTopo = tamanho
        dados = arrayOfNulls(tamanho)
    }
    //metodos auxiliares
     override fun estaCheia () : Boolean{
         return (ponteiroTopo == 0)
    }
     override fun estaVazia () : Boolean{
         return (ponteiroTopo == dados.size)
    }
     override fun imprimir () : String{
      	var resultado: String  = "["
        //Iterar a pilha
         //Palavra to ou downto o downto é do ponteiroTopo até 0 / to seria do 0 até ponteiroTopo só que de forma invertida
         //Caso eu queira que o count fosse mais do que 1, acrescentasse a palvra chave step to e o valor desejado
        for(i in ponteiroTopo .. dados.size - 1){
        	if(i == dados.size - 1){
                resultado += "${dados[i]}"
            }        	
         	else{
                resultado += "${dados[i]},"
            }        	
        }
        return "$resultado]" 
     }
    //metodos principais
    override fun empilhar(dado: Any?){
        if(!estaCheia()){
             ponteiroTopo--
             dados[ponteiroTopo] = dado
        }else{
            print("A pilha esta cheia")
        }
          
    }
    //Remoção dos valores de uma pilha
    override fun desempilhar(): Any?{
        var retorno: Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
            ponteiroTopo++
        }else{
            print("Stack is empty")
        }
        return retorno
    }
    //Verificação do topo da pilha
    override fun topo (): Any?{
        var retorno: Any? = null
        if(!estaVazia()){
            retorno = dados[ponteiroTopo]
        }else{
           print("Stack is empty")
        }
        return retorno
    }     

}	