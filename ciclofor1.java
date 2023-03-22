import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner m = new Scanner(System.in);
        int x;
        float y;
        for (int i=1;i<=10;i++){
            System.out.println("Ingrese un valor para X "+i);
            x = m.nextInt();
            if (x==7){
                System.out.println("No se puede divir por 0\nFin del ciclo");
                break;
            }
            else{
            y= (3*x+2)/(x-7);
            System.out.println("La solucion es: "+y);
            }
        }
    }
}
