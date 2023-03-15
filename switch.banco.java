import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner m = new Scanner(System.in);
        int n=1;
        int i=1,acu=0, opc, con=0, sal=0, t=0;
        do{
        System.out.println("Bienvenidos\n1. Consignar dinero.\n2. Ver saldo.\n3. Sacar dinero.\nSeleccione el servicio deseado.");
        opc = m.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ingrese la cantidad de dinero que quiere consignar.");
                con= m.nextInt();
                t= t+con;
                break;
            case 2:
                System.out.println("El saldo a la fecha: "+t);
                break;
            case 3:
                System.out.println("Ingrese la cantidad de dinero que quiere sacar.");
                sal = m.nextInt();
                if (t>=sal){
                    t=t-sal;
                    System.out.println("Total de dinero: "+t);
                }else{
                    System.out.println("Saldo insuficiente.");
                }
                break;
        default:
            System.out.println("Opcion no valida.");
        }
        System.out.println("¿Desea realizar otra operacion?\n1. Si\n2. No");
        n= m.nextInt();
    }while(n!=2);
    }
}
