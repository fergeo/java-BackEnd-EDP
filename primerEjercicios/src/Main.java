//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void ejercicio1(){

        float precio, desc;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el precio del articulo: ");
        precio = lectura.nextFloat();

        System.out.println("Ingrese el descuento a aplicar: ");
        desc = lectura.nextFloat();

        System.out.println("El precio con descuento es: " + (precio - (precio * desc)/100));
    }

    public static void ejercicio2(){

        int num, i, b;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el numero a verificar: ");
        num = lectura.nextInt();

        while (num <= 0){

            System.out.println("Ingrese un numero positivo: ");
            num = lectura.nextInt();

        }

        b = 0;

        for (i = 0; i < num; i++) {
            if ( num%i == 0){
                b = b + 1;
            }
        }

        if ( b==2 ){
            System.out.println("El numero " + num + " es Primo");
        }
        else{
            System.out.println("El numero " + num + " no es Primo");
        }

    }

    public static void ejercicio3(){

        float celsius, faren;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius a convertir en Farenheit");
        celsius = lectura.nextFloat();

        faren = (celsius * 9/5) + 32;

        System.out.println("La temperatura en Fahrenheit es " + faren);

    }

    public static void ejercicio4(){

        int num, i, resul;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el numero al que le quiere calcular el factoriaL: ");
        num = lectura.nextInt();

        resul = 1;

        for(i = 1; i < num; i++) {
            resul = resul * i;
        }

        System.out.println("El factorial de " + num + " es " + resul);

    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();

    }
}