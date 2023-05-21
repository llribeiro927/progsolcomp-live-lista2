import java.util.Scanner;

public class Lista02_exer18 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (while/do while/for) 
     * Data: 30/04/2023
     */
    public static void main(String[] args) throws Exception {
        
        int contador = 1; 
        int fatorial = 1;
        int num; 

        Scanner input = new Scanner(System.in);

        while (contador < 2) {
            System.out.println("Digite um número: ");


            num = input.nextInt();

            for(int i = 1; i <= num; i++){
                fatorial = fatorial * i;
            }
            System.out.println("!" + num + " = " + fatorial);
            contador++;
            
        }
    }
}
