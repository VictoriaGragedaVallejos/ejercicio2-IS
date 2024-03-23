
public class aritmatica {
    public static boolean esPrimo(int numero) {    //MARIA VICTORIA GRAGEDA VALLEJOS-> NUEMERO PRIMO
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
