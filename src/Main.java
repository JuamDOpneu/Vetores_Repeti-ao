import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tabuada =
        sc.nextInt();

        //inicializaçao, condiçao, incremento
        // ++ -> vai somar +1 i= i + 1
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabuada: " + (tabuada * i));}

        }

    }
