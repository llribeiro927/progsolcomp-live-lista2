import java.util.Scanner; 

public class Lista02_exer06 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     * Data: 15/04/2023
     */
    public static void main(String[] args) {
        // Faça um programa para imprimir o conceito de um aluno. O
        //conceito é calculado em função da nota do aluno que varia de 0
        //a 100. As faixas da correlação são mostradas abaixo:
        //Nota Conceito
        //0 a 49 Insuficiente
        //50 a 64 Regular
        //65 a 84 Bom
        // 85 100 Ótimo
        int conceito; 

        System.out.println("Informe o conceito do aluno: ");
        Scanner teclado = new Scanner(System.in);
        conceito = teclado.nextInt(); 

        if (conceito <= 49) {
            System.out.println("O seu conceito é insuficiente! "); 
        }
        else if (conceito >= 50 && conceito <= 64){
            System.out.println("O seu conceito é regular! ");
        }
        else if (conceito >= 65 && conceito <= 84){
            System.out.println("O seu conceito é bom! ");
        }
        else if (conceito >= 85 && conceito <= 100){
            System.out.println("O seu conceito é ótimo! ");
        }
        teclado.close();
    }
    
}
