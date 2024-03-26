package AulasEstruturas.Arrays;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int array[] = new int[5];
        int tamanho = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor " + (i + 1));
            array[i] = s.nextInt();
            tamanho++;
        }
        // Impressão do array
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
