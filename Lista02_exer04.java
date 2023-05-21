import javax.swing.JOptionPane; 

public class Lista02_exer04 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     * Data: 14/04/2023
     */
    public static void main(String[] args) {
        // Faça um programa que leia um número inteiro e mostre uma
        // mensagem indicando se este número é par ou ímpar e se é
        // positivo ou negativo.
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        if (numero % 2 == 0) {
            System.out.println("O número é par ");
        }else {
            System.out.println("O número é ímpar ");
        }
        
        if (numero >= 0) {
            System.out.println("O número é positivo ");
  
        }else {
            System.out.println("O número é negativo ");
        }
    }
    
}