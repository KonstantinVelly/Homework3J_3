public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum1 = 1_000_000;
        int period1 = 12;
        double ratio1 = 9.99 / 100 / 12;
        double monthlyPayment = service.annuity(sum1, ratio1, period1);
        System.out.printf("На 12 месяцев:" + "%.0f", monthlyPayment);
        System.out.println();
        period1 = 24;
        monthlyPayment = service.annuity(sum1, ratio1, period1);
        System.out.printf("На 24 месяца:" + "%.0f", monthlyPayment);
        period1 = 36;
        monthlyPayment = service.annuity(sum1, ratio1, period1);
        System.out.printf("На 36 месяцев:" + "%.0f", monthlyPayment);
    }
}
