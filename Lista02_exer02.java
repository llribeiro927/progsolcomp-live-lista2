import java.util.Scanner; 

public class Lista02_exer02 {
    /*
     *  Nome do aluno: Lucas Lima Ribeiro
     *  RA: 12723130989
     *  Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     *  Data: 14/04/2023
     */
    public static void main(String[] args) {
        // Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
        int valorA, valorB, valorC; 
        
        System.out.println("Digite o primeiro valor: ");
        Scanner teclado = new Scanner(System.in);
        valorA = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        valorB = teclado.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valorC = teclado.nextInt(); 

        if (valorA <= valorB && valorB <= valorC) {
            System.out.println("Os números digitados em ordem crescente é: " + valorA + "," + valorB + "," + valorC);
            
        }
            else if (valorA <= valorC && valorC <= valorB ){
                System.out.println("Os números digitados em ordem crescente é: " + valorA + "," + valorC + "," + valorB);
                
            }else if (valorB <= valorA && valorA <= valorC){
                System.out.println("Os números digitados em ordem crescente é: " + valorB + "," + valorA + "," + valorC);
            
           
        }else if (valorB<= valorC && valorC <= valorA){
            System.out.println("Os números digitados em ordem crescente é: " + valorB + "," + valorC + "," + valorA);

        }else if (valorC <= valorA && valorA <= valorB){
            System.out.println("Os números digitados em ordem crescente é: " + valorC + "," + valorA + "," + valorB);

        }else if (valorC <= valorB && valorB <= valorA){
            System.out.println("Os números digitados em ordem crescente é: " + valorC + "," + valorB + "," + valorA);
            

        }
        teclado.close();
       
    }
}
