public class Lista02_exer12 {
    /*
     * Nome do aluno: Lucas Lima Ribeiro 
     * RA: 12723130989
     * Nome do programa: Estruturas de Decisão usando (while/do while/for)
     * Data: 21/05/2023
     */
    public static void main(String[] args) throws Exception {
       
        int numero = 0; 

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }


            numero += 2;
        } while (numero % 7 != 0);
    }
}
