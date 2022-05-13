import java.lang.Math;

class CBBAtividadePratica3 {
    public static void main(String[] args) {
        int metros = 7;
        int expoente = 3;
        int valor = 100;
        double resultado = Cubico(metros, expoente);
        double total = resultado * valor;
        System.out.println("O valor do orçamento é: " + total);
    }

    static double Cubico(int num, int pow) {
        return Math.pow(num, pow);
    }
}
