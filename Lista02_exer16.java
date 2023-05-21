import java.util.Scanner; 

public class Lista02_exer16 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (while/do while/for) 
     * Data: 30/04/2023
     */
    public static void main(String[] args) throws Exception {
       
       boolean start = false; 

       System.out.println("Informe um número menor do que 0 ");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt(); 

       while (n < 0) {
           start = false;
           n++; 
           
        }
        System.out.print("O código terminou ");
            
    }
    
}    

