public class LimitException extends Exception{

    private double remainingAmount;//оставшее количество денег

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public LimitException() {

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
