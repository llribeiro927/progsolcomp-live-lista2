import java.util.Scanner;

public class Lista02_exer07 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     * Data: 15/04/2023
     */
    public static void main(String[] args) {
        // Faça um programa calcula o total de uma hospedagem em um
        //hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
        //R$ 5.50 por diária, se o número de diárias for maior que 15;
        //R$ 6.00 por diária, se o número de diárias for igual a 15;
        // R$ 8.00 por diária, se o número de diárias for menor que 15.
        int diaria;
        int precoDiaria = 60;
        double taxaSericos1 = 5.50;
        double taxaServicos2 = 6.00;
        double taxaServicos3 = 8.00; 

        System.out.println("Informe quantas diárias: ");
        Scanner teclado = new Scanner(System.in);
        diaria = teclado.nextInt(); 
        
        if (diaria > 15) {
            diaria = (int) (precoDiaria * taxaSericos1 * diaria);
            System.out.println("O preço total das diárias é de: " + diaria + " R$ ");  
        }
        else if (diaria == 15){
           diaria = (int) (precoDiaria * taxaServicos2 * diaria);
           System.out.println("O preço total das diárias é de: " + diaria + " R$ ");
        }
        else if (diaria < 15){
            diaria = (int) (precoDiaria * taxaServicos3 * diaria);
            System.out.println("O preço total das diárias é de: " + diaria + " R$ ");
        }
        teclado.close();
        

        
    }
    
}
