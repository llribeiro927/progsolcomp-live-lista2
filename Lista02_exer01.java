import java.util.Scanner;
/*
 * Nome do aluno: Lucas Lima Ribeiro
 * RA: 12723130989
 * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case) 
 * Data: 14/04/2023
 */
public class Lista02_exer01 {

    public static void main(String[] args) {
        // Faça um programa que leia dois números A e B e imprima o maior deles.
        int numeroA, numeroB; 

        System.out.println("Informe o número A: ");
        Scanner teclado = new Scanner(System.in);
        numeroA = teclado.nextInt();

        System.out.println("Informe o número B: ");
        numeroB = teclado.nextInt(); 

        if (numeroA > numeroB) {
            System.out.println("O maior entre eles é o: " + numeroA);
        } 
        else {
            System.out.println("O maior entre eles é o: " + numeroB);
        }
        teclado.close();


        
        
    }
}