//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;

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

//    Ejercicio 1: Calculadora de IMC (Índice de Masa Corporal)
//    Crea un programa que solicite al usuario ingresar su peso (en kilogramos) y su altura (en metros). L
//    uego, calcula el IMC (peso / altura^2) y muestra un mensaje indicando si la persona tiene un peso bajo,
//    normal, sobrepeso o obesidad, según los valores típicos del IMC.
    public static void calculador(){

        float peso, altura;
        double IMC;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su peso en Kilogramos: ");
        peso = lectura.nextFloat();

        System.out.println("Ingrese su altura en metros ");
        altura = lectura.nextFloat();

        IMC = ( peso / Math.pow( altura , 2 ));

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("El IMC es " + df.format(IMC));

    }

 //     Ejercicio 2: Conversor de Monedas
 //     Desarrolla un programa que permita al usuario convertir una cantidad de pesos argentinos a dolares.
 //     El usuario debe ingresar la cantidad en pesos, y el programa debe realizar la conversión y mostrar el resultado.
 //     Utiliza una tasa de conversión fija.
    public static void conversor(){

        final double TAZA = 1000.51;

        float pesos;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Engrese la cantidad en pesaso argnetinos: ");
        pesos = lectura.nextFloat();

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("El valor ingresado en dolares es " + df.format(pesos * TAZA));
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //calculador();
        conversor();

    }
}