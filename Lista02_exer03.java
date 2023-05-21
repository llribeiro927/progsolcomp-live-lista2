import java.util.Scanner; 

public class Lista02_exer03 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro 
     * RA: 12723130989
     * Nome do programa: Estruturas de Decisão usando (while/ do while/for)
     * Data: 21/05/2023
     */
    public static void main(String[] args) throws Exception {
      
        int a;
        int b; 
        int resto; 

        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt(); 

        System.out.println("Digite outro número: ");
        b = input.nextInt(); 
        input.close();

        resto = a / b;

        if (resto == 0) {
            System.out.println("Os números são múltiplos");
        }
        else{
            System.out.println("Os números não são múltiplos");
        }
    }
}
