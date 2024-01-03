import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        int quantidade = 0;
        double valor = 0;
        double aPagar = 0;

        for(int i = 0; i <2; i++){
            codigo = sc.nextInt();
            quantidade = sc.nextInt();
            valor = sc.nextDouble();
            aPagar = aPagar + valor * quantidade;
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",aPagar);
    }
}
