public class Main{
    public static void main (String[] args) {
        int impares=0;
        for (int i=0;i<=100;i++){
            if (i%2!=0){
                impares++;
            }
        }
        System.out.println("Cantidad de impares son: "+impares);
    }
}
