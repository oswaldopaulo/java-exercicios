import java.util.Scanner;
public class Media {
    public static void main(String[] args){
        int n1, n2, n3;
        float resultado;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite n1: ");
        n1 = scan.nextInt();
        System.out.println("Digite n2: ");
        n2 = scan.nextInt();
        System.out.println("Digite n3: ");
        n3 = scan.nextInt();

        resultado = (n1+n2+n3)/3;
        System.out.println("A média é " + resultado);
    }
}
