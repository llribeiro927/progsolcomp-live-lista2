import java.util.Scanner;

public class Lista02_exer20{
    /*
     * Nome do aluno: Lucas Limma Ribeiro 
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (while/do while/for)
     * Data: 30/04/2023
     */
    public static void main(String[] args) throws Exception {
       double cargaMax, pesoPessoas = 0, pesoTotal = 0; 
       int numeroPessoas = 0, maxPessoas; 

       System.out.println("Digite a carga máxima do elevador: "); 
       Scanner input = new Scanner(System.in); 
       cargaMax = input.nextDouble(); 

       System.out.println("Digite o número máximo de pessoas: ");
       maxPessoas = input.nextInt();

       do{
            System.out.printf("Digite o peso da pessoa #" + (numeroPessoas + 1) + ": ");
            pesoPessoas = input.nextDouble(); 

            if (pesoTotal + pesoPessoas > cargaMax) {
                System.out.println("Carga máxima atingida. ");
                break; 
            }
            if(numeroPessoas + 1 > maxPessoas){
                System.out.println("Quantidade máxima de pessoas atingida. ");
                break; 
            }
                pesoTotal += pesoPessoas; 
                numeroPessoas++; 

       } while(true);
       
       System.out.println("Peso total: " + pesoTotal);
       System.out.println("Quantidade de pessoas: " + numeroPessoas);

       input.close();

    }
}
