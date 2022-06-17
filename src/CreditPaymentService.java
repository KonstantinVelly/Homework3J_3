public class CreditPaymentService {

    public double annuity(int creditSum, double rate, int months) {
        double payment = creditSum * ((rate * Math.pow((1 + rate), months)) / (Math.pow((1 + rate), months)-1));
        //Формула аннуитета: n * ((r * Math.pow((1 + r), 12 * y)) / (Math.pow((1 + r), 12 * y) - 1));
        return payment;
    }
}