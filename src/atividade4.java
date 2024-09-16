import java.net.SecureCacheResponse;
import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int id;

        do { //colocar sempre o comando a ser repetido dentro CARALHO
            System.out.println("Digite sua idade ");
            id = sc.nextInt();
            if (id <= 18) {
                System.out.println("digite uma idade valida:" );
            }
        }while(id <= 18);

    }
}