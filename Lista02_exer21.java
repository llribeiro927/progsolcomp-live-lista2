import java.util.Scanner;

public class Lista02_exer21 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989 
     * Nome do programa: Estruturas de Decisão usando (while/do while/for)
     * Data: 21/05/2023
     */
    public static void main(String[] args) throws Exception {
        
        int numero;
        int i = 1; 
        int resultadoTabuada; 
        int j = 1; 

        Scanner input = new Scanner(System.in); 

        System.out.println("Digite um número positivo: ");
        numero = input.nextInt(); 

        for(i = 1; i <= numero; i++){
            System.out.println("Tabuada do número " + i + " : ");
            for(j = 1; j <= 10; j++){
                resultadoTabuada = i * j; 
                System.out.println(i + " x " + j + " = " + resultadoTabuada );
            }
        }
    }
}
