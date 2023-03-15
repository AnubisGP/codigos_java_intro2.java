import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner m = new Scanner(System.in);
        int i=1,fac=1,num;
        System.out.println("Ingrese un numero a calcular");
        num = m.nextInt();
        do{
            fac*=i;
            i++;
        }while(i<=num);
        System.out.println("El factorial de "+num+" es "+f);
    }
}
