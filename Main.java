public class Main {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 2; i <= 100; i++) {

            boolean esPrimer = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimer = false;
                }
            }

            if (esPrimer) {
                suma = suma + i;
            }
        }

        System.out.println("Suma dels primers de l'1 al 100: " + suma);
    }
}
