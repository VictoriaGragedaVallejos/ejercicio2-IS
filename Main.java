public class Main {
    public static void main(String[] args) {
        aritmetica aritmetica = new aritmetica();

        boolean res = aritmetica.esPrimo(5);    //MARIA VICTORIA GRAGEDA VALLEJOS
        System.out.println(res);    //MARIA VICTORIA GRAGEDA VALLEJOS
        
        int respSuma = aritmetica.suma(40, 50); //ROCIO DEL ALBA QUISPE CAYO
        System.out.println("Respuesta suma 40 + 50 = " + respSuma); //ROCIO DEL ALBA QUISPE CAYO

        int respMulti = aritmetica.multiplicacion(4, 20); //SHIRLEY MARIA CUSIQUISPE MOLLE
        System.out.println("Respuesta suma 4 * 20 = " + respMulti); 
	
	      int respDiv = aritmetica.division(4.3, 5); //ANDREA REBECA YUCRA TOVAR
        System.out.println("Respuesta division 4.3 / 5 = " + respDiv);

        int resRes = aritmetica.resta(5,3);
        System.out.println("Respuesta resta es: "+resRes);
    }
}