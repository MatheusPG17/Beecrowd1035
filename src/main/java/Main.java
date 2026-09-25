
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;
        String linha;
        int A, B, C, D;
        
        linha = leia.nextLine();
        lista = linha.split(" ");
        A = Integer.parseInt(lista[0]);
        B = Integer.parseInt(lista[1]);
        C = Integer.parseInt(lista[2]);
        D = Integer.parseInt(lista[3]);
        
        if (B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && A % 2 ==0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
        
    }
}
