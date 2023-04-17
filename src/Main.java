
public class Main {
    public static void main(String[] args) {
        /* Suma de tres enteros: */
        int resultado = sumartres(2, 4, 5);
        System.out.println(resultado);

        Coches micoche = new Coches();
        micoche.quitarpuerta();
        System.out.println(micoche.puertas);


    }

    public static int sumartres(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coches {
        public int puertas = 4;

        public void quitarpuerta() {
            this.puertas++;
        }

    }
}
