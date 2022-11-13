import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        //Scanner scanner = new Scanner(System.in);


        bankAccount.deposit(20000);

        while (!false) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Успешно! вы сняли сумму: 6000" +" остаток: " +bankAccount.getAmount());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new RuntimeException(e);
                try {
                    bankAccount.withDraw(2000);
                    System.out.println("Успешно! вы сняли сумму: 2000" +" остаток: "+bankAccount.getAmount());
                    break;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    //throw new RuntimeException(ex);
                }

            }

                }

        }
    }
