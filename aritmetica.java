
public class aritmetica {
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

    public int suma(int num1, int num2) {   //ROCIO DEL ALBA QUISPE CAYO
        int res = num1 + num2;
        return res;
    }
}
