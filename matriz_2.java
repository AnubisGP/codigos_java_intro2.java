import java.util.Scanner;
public class clase_virtual {
	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int f,c,s=0;
		String nombre;
		String [][] palabras = new String [3][3];
		System.out.print("Ingrese el numero de fila y columna para colocar el dato");
		f=sn.nextInt();
		c=sn.nextInt();
		System.out.print("Ingrese un nombre");
		nombre=sn.next();
		for(int i=0; i<palabras.length; i++) {
			for(int j=0; j<palabras[i].length; j++) {
				if(f==i && c==j) {
					palabras[i][j]=nombre;
					s++;
				}
			}
		}
		if (s==0) {
			System.out.println("Posicion no encontrada");
		}
		System.out.println("\n==========================");
		for (int i=0; i<palabras.length;i++) {
			System.out.println();
			for(int j=0;j<palabras[i].length;j++) {
				System.out.print(palabras[i][j]+"\t\t");
			}
		}
	}
}
