import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner m = new Scanner(System.in);
        int x, y;
        y=(int) Math.random()*(19-1)+1;
        System.out.println(y);
        for (int i=1; i<=5; i++){
            System.out.println("Intento numero "+i+" para adivinar un numero del 1 al 19");
            x = m.nextInt();
                if(x==y){
                    System.out.println("¡Felicidades, Has adivinado el numero!");
                    break;
                }else{
                    System.out.println("No has logrado adivinar el numero"+y);
                }   
        }
    }
}
