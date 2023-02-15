import java.util.Scanner;

public class ejercicio1_1 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        double x, r;
        System.out.println("Ingrese un valor para X");
        x = entrada.nextDouble();
        r = 3*Math.pow(x,3) - 2*Math.pow(x,2) + 4*x + 1;
        System.out.println("El resultado es: "+r);

    }
}
