package AulasEstruturas.ExerciciosArrays;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Declaração de tamanho, que vai fazer o controle da quantidade de elementos
        // que o array
        // ira receber
        int tamanho = 0;

        // Entrada do limite do valor do úsuario
        System.out.println("Digite um valor limite : ");
        int x = s.nextInt();
        tamanho = x;

        // Declaração do Array
        int array[] = new int[tamanho];

        for (int i = 0; i < x; i++) {
            // Recebimento do valor i até o limite especificado pelo o usuario
            // Incrementação do resultado no array
            array[i] = (int) Math.pow(i + 1, 2);
        }
        // Impressão do array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
