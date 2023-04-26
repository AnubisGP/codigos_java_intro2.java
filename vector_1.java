import java.util.Scanner;
public class Vector_1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int [] v = new int[21];
        int suma=0;
        int nm=0;
        
        for (int i=1; i<v.length; i++){
        	System.out.print("Ingrese el numero "+i+" para completar el vector:\n");
        	v[i]= sn.nextInt();
        	suma+=v[i];
        	if (v[i]==-1){
        		System.out.println("Ha finalizado el proceso");
        		break;
        	}
        	if (v[i]>nm) {
        		nm=v[i];
        	
        	}
        }
        System.out.println("El vector es: ");
        for (int i : v) {
        	System.out.print(i+"\t");
        }
        System.out.println("\nLa suma del Vector es: "+suma);
        System.out.println("El numero mayor del vector es: "+nm);
	}
}
