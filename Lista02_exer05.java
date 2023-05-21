import java.util.Scanner;
import java.util.MissingFormatArgumentException;

public class Lista02_exer05 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (If/Else/Switch/Case)
     * Data; 16/04/2023
     */
    public static void main(String[] args) {
        // Faça um programa que leia o nome, o sobrenome, a idade, em
        // anos, e a naturalidade (cidade de nascimento) de uma pessoa.
        // Depois, o programa deve dar a seguinte opção “Deseja
        // visualizar dados completos?”. Se o caractere digitado pelo
        // usuário for ‘S’ o programa deve imprimir na tela Nome,
        // Sobrenome, idade e naturalidade. Se o caractere digitado pelo
        // usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
        // o caractere não for nenhuma das outras opções acima o programa
        // deve imprimir “Digitação errada. Tente Novamente”

        String nome;
        String sobrenome;
        int idade;
        String naturalidade;
        char opcao;

        System.out.println("Digite o seu nome: ");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.nextLine();
        
        System.out.println("Digite o seu sobrenome: ");
        sobrenome = teclado.nextLine(); 

        System.out.println("Digite a sua naturalidade: ");
        naturalidade = teclado.nextLine(); 
        

        System.out.println("Digite a sua idade: ");
        idade = teclado.nextInt();

       
        System.out.println("Deseja visualizar dados completos? (S/N) ");
        opcao = teclado.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.printf("Os dados informados foram: Nome: %s Sobrenome: %s Idade: %d Naturalidade: %s ", nome, sobrenome, idade, naturalidade);   
        }
        else if (opcao == 'N' || opcao == 'n'){
            System.out.printf("Seu nome é: %s ", nome);
            System.out.printf("Sua idade é: %d ", idade);
        }
        else {
            System.out.println("Digitação incorreta. Tente novamente. ");
        }
    }
}
