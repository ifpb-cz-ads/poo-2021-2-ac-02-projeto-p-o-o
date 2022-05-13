public class BMExercio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        // int int2 = int1 + long1; //Isso ocorre pois o operador de atribuição composta
        // faz uma conversão implícita ou não faz a conversão.

        // Para acorrigir o erro, basta apenas fazer um casting, tranformando o LONG em
        // INT na hora da soma.
        int int2 = (int) (int1 + long1);
        System.out.println("Resultado da soma entre int1 e long1: " + int2);
    }
}
