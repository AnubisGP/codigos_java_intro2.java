
public class Main{
	public static void main(String[] args) {
		int [][] ma= {{22,19,21,15,17},{25,18,20,12,10},{15,13,18,12,10},{30,24,23,26,29}};
		int sumaf,sumac=0,nma=0,nme=0,t;
		
		for ( int i=0; i<ma.length; i++){
		    for (int j=0; j<ma[i].length; j++){
		        System.out.print(ma[i][j]+"\t");
		    }
		    System.out.println("");
		}
	    for ( int i=0; i<ma.length; i++){
	        sumaf=0;
		    for (int j=0; j<ma[i].length; j++){
		        sumaf += ma[i][j];
		            if (ma[i][j]>nma){
		                nma=ma[i][j];
		        }
		    }
		    System.out.print("\nSemanalmente la sala "+(i+1)+" es ocupada por "+sumaf+" de estudiantes.");
		}
		System.out.println("");
		System.out.println("\nLa sala 4 cuenta con "+nma+" estudiantes.");
		    for (int j=0; j<ma[j].length; j++){
		        for (int i=0; i<ma.length;j++){
		            sumac += ma[i][j];
		                if (sumac<nme){
		                    nme=sumac;
		                }
		        }
		    }
		System.out.println("\nEL dia -- es el que tiene menos estudiantes con solo "+nme+" estudiantes");
	}
}
