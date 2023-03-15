import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int i=1,n,aprob=0,repro=0;
        float notas,suma=0,prom=0;
        System.out.println("Ingrese la cantidad de notas a calcular");
        n=s.nextInt();
        while (i<=n){
            System.out.println("Nota "+i);
            notas= s.nextFloat();
            if (notas >=0.0 && notas <=5.0){
                suma+=notas;
                if (notas >=3.0){
                    aprob++;
                }
                else{
                    repro++;
                }
            }
            else{
                    System.out.println("Dato erroneo");
                    i--;
                } 
            
            
            i++;
        }
        prom= suma/n;
        System.out.println("El promedio de las "+n+" notas es: "+prom);
        System.out.println("Cantidad de notas aprobadas: "+aprob);
        System.out.println("Cantidad de notas reprobadas. "+repro);
        
    }
}
