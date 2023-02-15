import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double n1, n2, r;
        System.out.println("Ingrese el primer numero");
        n1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        n2 = entrada.nextDouble();
        r = n1+n2;
        System.out.println("La suma de los numeros es: "+r);
        
    }
}
