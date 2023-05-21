import java.util.Scanner; 

public class Lista02_exer08 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro 
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case) 
     * Data: 15/04/2023
     */
    public static void main(String[] args) {
        // Crie um programa que lê um número entre 1 e 12, correspondendo
        // a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
        // Ao final, o programa deve imprimir uma mensagem identificando,
        // com base no número digitado, o nome do mês e a estação. 

        int b;

        System.out.println("Digite um mês ");
        Scanner teclado = new Scanner(System.in);
        b = teclado.nextInt(); 

        switch (b) {
            case 1: System.out.println("Janeiro - Estação: Verão ");
                
                break;
                case 2: System.out.println("Fevereiro - Estação: Verão ");
                break;
                case 3: System.out.println("Março - Estação: Outono ");
                break;
                case 4: System.out.println("Abril - Estação: Outono ");
                break;
                case 5: System.out.println("Maio - Estação: Outono ");
                break;
                case 6: System.out.println("Junho - Estação: Inverno ");
                break; 
                case 7: System.out.println("Julho - Estação: Inverno ");
                break;
                case 8: System.out.println("Agosto - Estação: Inverno ");
                break; 
                case 9: System.out.println("Setembro - Estação: Primavera ");
                break; 
                case 10: System.out.println("Outubro - Estação: Primavera ");
                break;
                case 11: System.out.println("Novembro - Estação: Primavera ");
                break;
                case 12: System.out.println("Dezembro - Estação: Verão ");
        
            default: System.out.println("Não existe esse mês ");
                break;
        }
        teclado.close();
    }
    
}
