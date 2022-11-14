import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        //Scanner scanner = new Scanner(System.in);


        bankAccount.deposit(20000);

        while (!false) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Успешно! вы сняли сумму: 6000" +/*bankAccount.getRemainingAmount()+*/" остаток: " +bankAccount.getAmount());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new RuntimeException(e);
                try {
                    bankAccount.withDraw((int) bankAccount.getRemainingAmount());
                    System.out.println("Успешно! вы сняли сумму: " +bankAccount.getAmount()+" остаток: "+bankAccount.getRemainingAmount());
                    break;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    //throw new RuntimeException(ex);
                }

            }

                }

        }
    }
