import java.util.Scanner;

public class MobileBanking {


    public static void main(String[] args) {
        BankAccount Kezia;

        Scanner login = new Scanner(System.in);
        System.out.print("Name: ");
        String name = login.nextLine();
        System.out.print("Password: ");
        String password = login.nextLine();

        System.out.println("Welcome "+name+"!");
        System.out.println("");
        System.out.println("1.Individual");
        System.out.println("2.Business");

        System.out.print("Pilihan: (1/2) ");
        int pilihan = login.nextInt();

        BankAccount account = new BankAccount(password, pilihan);


    }
}
