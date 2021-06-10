import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int number, total, total2, contador, aux;

        total = 0;
        total2 = 0;
        contador = 0;

        System.out.println("Escribe numeros entre 0 y 1000");
        System.out.println("Se te mostrara la cantidad de multiplos de 6 acumulados");
        System.out.println("Y se te mostrara la suma de los numeros entre 0 y 10");
        do {
            System.out.println("");
            System.out.println("Escribe un numero entre 0 y 1000");

            number = entrada.nextInt();
            total = total + number;
            System.out.println(total);

            aux = number % 6;
            if (aux == 0){
                contador++;
                System.out.println("Hay " + contador + " multiplos de 6");
            }

            if (number > 0 && number <= 10){
                total2 = total2 + number;
                System.out.println("La suma de los numeros entre 0 y 10 es " + total2);
            }
        }while (total <= 1000);

    }
}