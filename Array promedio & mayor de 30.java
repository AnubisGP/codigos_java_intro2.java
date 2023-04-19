public class Main{
    public static void main(String[]args){
        int [] vector = new int [10];
        float suma=0,prom;
        int cont=0, cont1=0;
        for (int i=0; i<vector.length; i++){
            vector[i]= (int) (Math.random()*50);
            System.out.print(vector[i]+"\t");
            if (vector[i]>=10 && vector[i]<=20){
                suma+=vector[i];
                cont++;
                prom=suma/cont;
            }
            if (vector[i]>30){
                cont1++;
            }
        }
        System.out.print("El promedio de los datos entre 10 y 20 es: "+prom);
        System.out.print("La cantidad de datos mayores que 30 son: "+cont1);
    }
}
