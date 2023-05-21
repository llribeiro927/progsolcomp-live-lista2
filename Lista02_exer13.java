public class Lista02_exer13 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro
     * RA: 12723130989
     * Nome do programa: Estrutura de Decisão usando (while/ do while/for) 
     * Data: 30/04/2023
     */
    public static void main(String[] args) throws Exception {
       
        int somaTotal = 0, soma = 0; 

        while (soma <= 100) {
            somaTotal += soma; 
            soma++;
        }
        System.out.println("A soma total dos números de 1 a 100 é de: " + somaTotal);
    }
}
