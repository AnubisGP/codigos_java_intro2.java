import java.util.Scanner;
public class Vector_2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float [] v = new float[5];
        
        for (int i=0; i<v.length; i++){
        	System.out.print("Ingrese el numero "+i+" para rellenar el vector.\n");
        	v[i]= sn.nextFloat();
        }
        System.out.println("\nEl vector es: ");
        for (float i : v){
        	System.out.print(i+"\t");
        }
	}
}
