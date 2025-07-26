import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seu nome?");
        String name = scanner.next();
        System.out.println("Qual sua idade?");
        int age = scanner.nextInt();
        System.out.printf("Ola %s sua idade é %s \n", name, age);



    }
    }
