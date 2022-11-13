public class BankAccount {
    private double amount; // Остаток на счете

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount=sum;
        //System.out.println(" положить деньги на счет");
    }

    public void withDraw(int sum1) throws Exception {
        if (sum1>amount){
            throw new Exception("Ошибка! Сумма превышает остаток на счете "+amount);
        }
        else {
            amount=amount-sum1;
        }

    }



}
