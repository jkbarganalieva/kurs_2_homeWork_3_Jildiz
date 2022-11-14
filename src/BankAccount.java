public class BankAccount extends LimitException{
    private double amount; // Остаток на счете

    public BankAccount(String message, double remainingAmount) {
        super(message, remainingAmount);
    }

    public BankAccount() {
        super();
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount=sum;
        //System.out.println(" положить деньги на счет");
    }

    public void withDraw(int sum1) throws LimitException {
        if (sum1>amount){
            throw new LimitException("Ошибка! Сумма превышает остаток на счете ",amount);
        }
        else {

            this.amount=amount-sum1;
        }

    }



}
