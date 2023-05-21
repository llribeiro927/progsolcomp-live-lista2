import java.util.Scanner; 

public class lista02_exer19{
    /*
     * Nome do aluno: Lucas Lima Ribeiro 
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (while/do while/for)
     * Data: 30/04/2023
     */

    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);

        int tempo = 0; 
        System.out.println("Informe o volume em cm³: ");
        double volumeInicial = input.nextDouble(); 
        input.close();
       

        while (volumeInicial <= 1000) {
            volumeInicial = volumeInicial * 2; 
            tempo += 1;
        }
        System.out.println(volumeInicial);
        System.out.println(">O volume(cm³) é de: " + volumeInicial + "\n>Levando um total de " + tempo + "s para chegar no valor. ");
    }
}
