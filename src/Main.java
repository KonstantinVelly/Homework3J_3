public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int Sum1 = 1_000_000;
        int period1 = 12;
        double ratio1 = 9.99 / 100 / 12;
        double monthlyPayment = service.annuity(Sum1, ratio1, period1);
        System.out.printf("На 12 месяцев:" + "%.0f", monthlyPayment);
        System.out.println();
        int Sum2 = 1_000_000;
        int period2 = 24;
        double ratio2 = 9.99 / 100 / 12;
        double monthlyPayment2 = service.annuity(Sum2, ratio2, period2);
        System.out.printf("На 24 месяца:" + "%.0f", monthlyPayment2);
        int Sum3 = 1_000_000;
        int period3 = 36;
        double ratio3 = 9.99 / 100 / 12;
        double monthlyPayment3 = service.annuity(Sum3, ratio3, period3);
        System.out.println();
        System.out.printf("На 36 месяцев:" + "%.0f", monthlyPayment3);
    }
}
