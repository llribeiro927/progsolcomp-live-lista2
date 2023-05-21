import java.util.Scanner;

public class Lista02_exer09 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     * Data: 15/04/2023
     */
    public static void main(String[] args) {
        // Faça um programa que receba o valor da venda, escolha a
        // condição de pagamento no menu e mostre o total da venda final
        // conforme condições a seguir:

        // Valores:

        // Venda a Vista - desconto de 10%
        // Venda a Prazo 30 dias - desconto de 5%
        // Venda a Prazo 60 dias - mesmo preço
        // Venda a Prazo 90 dias - acréscimo de 5%
        // Venda com cartão de débito - desconto de 8%
        // Venda com cartão de crédito - desconto de 7%
        double valorDaVenda;
        int a; 

        System.out.println("Informe o valor da venda: ");
        Scanner teclado = new Scanner(System.in);
        valorDaVenda = teclado.nextDouble(); 

        System.out.println("Selecione a sua forma de pagamento: ");
        
        System.out.println("Forma: 1- Venda a Vista - desconto de 10% ");

        System.out.println("Forma: 2- Venda a Prazo 30 dias - desconto de 5% ");

        System.out.println("Forma: 3- Venda a Prazo 60 dias - mesmo preço ");

        System.out.println("Forma: 4- Venda a Prazo 90 dias - acréscimo de 5% ");

        System.out.println("Forma: 5- Venda com cartão de débito - desconto de 8% ");

        System.out.println("Forma: 6- Venda com cartão de crédito - desconto de 7% ");
        a = teclado.nextInt(); 

        switch (a) {
            case 1: valorDaVenda = valorDaVenda - (valorDaVenda * 0.10);
            System.out.println("O valor final da venda é de R$: " + valorDaVenda);
                break;
                case 2: valorDaVenda = valorDaVenda - (valorDaVenda * 0.05);
                System.out.println("O valor final da venda é de R$: " + valorDaVenda);
                break;
                case 3: System.out.println("O valor final da venda é o mesmo preço: " + valorDaVenda);
                break; 
                case 4: valorDaVenda = valorDaVenda + (valorDaVenda * 0.05);
                System.out.println("O valor final da venda é de R$: " + valorDaVenda);
                break; 
                case 5: valorDaVenda = valorDaVenda - (valorDaVenda * 0.08);
                System.out.println("O valor final da venda é de R$: " + valorDaVenda);
                break; 
                case 6: valorDaVenda = valorDaVenda - (valorDaVenda * 0.07);
                System.out.println("O valor final da venda é de R$: " + valorDaVenda);
        
            default: System.out.println("Não existe essa opção! ");
                break;
        }
        teclado.close();


    }

    
}