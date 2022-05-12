import java.util.Scanner;
public class SomaJava {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        float resultado;
        System.out.println("Qual o primeiro numero");
        n1 = scan.nextInt();
        System.out.println("Qual o segundo numero");
        n2 = scan.nextInt();
        resultado =  n1+ n2;
        System.out.println("Resultado da soma: " + resultado);
    }
}
