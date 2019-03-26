import java.util.Scanner;

/**
 *
 * @author A18YagoRM
 */
public class TarefaCVS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero enteiro:");
        int numero = sc.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        System.out.println("Son David Cancela");
    }
    
}
