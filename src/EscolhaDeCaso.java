public class EscolhaDeCaso {
    public static void main(String[] args){
        int opcao=4;
        switch (opcao){
            case 1,3:
                System.out.println("Escolheu 1 ou 3");
                break;
            case 2,4:
                System.out.println("Escolheu 2 ou 4");
                break;
            default:
                System.out.println("Fora da escolha");
                break;
        }
    }
}
