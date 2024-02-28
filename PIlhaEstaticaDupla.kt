class PilhaEstaticaDupla : DuplamenteEmpilhavel{


    private var ponteiroTopo1: Int
    private var ponteiroTopo2: Int
    private var dados: Array<Any?>
    //contrutores
    constructor():this(10){}
    
    constructor(tamanho: Int){
        ponteiroTopo1 = tamanho
        ponteiroTopo2 = tamanho
        dados = arrayOfNulls(tamanho)
    }

    override fun empilhar1(dado1: Any?) { }

    override fun empilhar2(dado2: Any?) { }

    override fun desempilhar1(): Any? { }

    override fun desempilhar2(): Any? { }

    override fun topo1(): Any? { }

    override fun topo2(): Any? { }

    override fun estaCheia1(): Boolean { }

    override fun estaCheia2(): Boolean { }

    override fun estaVazia1(): Boolean { }

    override fun estaVazia2(): Boolean { }

    override fun imprimir1(): String { }

    override fun imprimir2(): String { }





}