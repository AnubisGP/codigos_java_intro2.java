import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		int [][] m = new int [4][4];
		for (int i=0; i<m.length;i++) {
			for (int j=0;j<m.length;j++) {
				m[i][j]= (int)(Math.random()*20);
			}
		}
		for (int i=0; i<m.length;i++) {
			System.out.println();
			for(int j=0;j<m.length;j++) {
				System.out.print(m[i][j]+"\t");
			}
		}
	}
}
