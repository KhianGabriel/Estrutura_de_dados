package AulasEstruturas.Exemplos_Aula01.PilhaJava.PilhaInvertida;

import AulasEstruturas.Exemplos_Aula01.PilhaJava.PilhaEstatica.PilhaEstatica;

public class PilhaInvertidaMain {
    
     public static void main(String[] args) {
        
        Empilhavel pilha = new PilhaEstaticaInvertida(10);
		pilha.empilhar("Instituto");
		pilha.empilhar("Federal");
		System.out.println("Espiar:" + pilha.topo());		
		pilha.empilhar("de");
		pilha.empilhar("Educação");
		pilha.empilhar("Ciência");
		pilha.empilhar("e");		
		System.out.println("Espiar:" + pilha.topo());		
		Object conteudo = pilha.desempilhar();
		pilha.desempilhar();
		pilha.empilhar("Tecnologia");
		pilha.empilhar("da");
		pilha.empilhar("Bahia");	
		pilha.empilhar(pilha.desempilhar());
		pilha.empilhar(conteudo);
		System.out.println("Pilha="+pilha.imprimir());
    }
}
