public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ежемесячный платеж по кредиту на 12 месяцев: ");
        System.out.printf("%.0f", service.calculate(1_000_000 , 9.99 , 12));
        System.out.println(" руб.");
        System.out.println("Ежемесячный платеж по кредиту на 24 месяца: ");
        System.out.printf("%.0f", service.calculate(1_000_000 , 9.99 , 24));
        System.out.println(" руб.");
        System.out.println("Ежемесячный платеж по кредиту на 36 месяцев: ");
        System.out.printf("%.0f", service.calculate(1_000_000 , 9.99 , 36));
        System.out.println(" руб.");
    }
}