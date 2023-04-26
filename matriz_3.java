import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float [][] m = new float[3][4];
		float nma=0;
		float nme=0;
        
        for (int i=0; i<m.length; i++){
        	for (int j=0; j <m[i].length; j++) {
        	System.out.print("Ingrese las notas.");
        	m[i][j]= sn.nextFloat();
        		if (m[i][j]>nma) {
        			nma=m[i][j];
        			System.out.println("La mayor calificacion es: "+nma);
        		}
        		if (m[i][j]<nme) {
        			nme=m[i][j];
        			System.out.println("La mayor calificacion es: "+nme);
        		}
        	}
        }
    	
        System.out.println("\n==========================");
		for (int i=0; i<m.length;i++) {
			System.out.println();
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"\t\t");
			}
		}

	}

}
