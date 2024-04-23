public class Xdowhile {
    public static void main(String[] args) {
        int numero = 8;
        int contador = 1;

        do {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);
    }
}
