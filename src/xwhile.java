public class xwhile {
    public static void main(String[] args) {
        int multiplicando = 6;
        int multiplicador = 1;

        while(multiplicando <=6) {
            while (multiplicador <=10) {
                int resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + "X" + multiplicador + "=" + resultado);
                multiplicador++;
            }
            System.out.println();
            multiplicador = 1;
            multiplicando++;
        }

    }

}
