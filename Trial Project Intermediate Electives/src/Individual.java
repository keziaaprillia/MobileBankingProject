import java.util.Scanner;

public class Individual extends BankAccount {

    //construction
    private int total;
    private String message;


    //scanner
    Scanner inputotal = new Scanner(System.in);
    Scanner inputinfo = new Scanner(System.in);

    void transfer(){
        System.out.println("Account Number: "+ getAccountNumber());
        System.out.println("");

        System.out.print("Total: ");
        inputotal.nextInt();
        System.out.println("");
        System.out.print("Message: ");
        inputinfo.nextLine();
        System.out.println("");

        System.out.println("Transfer Berhasil");
    }
}
