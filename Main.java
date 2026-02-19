public class Main {

    public static void main(String[] args) {

        // Càlcul de la suma dels nombres primers de l'1 al 100
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

        // Segon càlcul: producte dels nombres de l'1 al 5
        int producte = 1;
        for (int i = 1; i <= 5; i++) {
            producte = producte * i;
        }
        System.out.println("Producte de l'1 al 5: " + producte);
    }
}
