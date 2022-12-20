public class CreditPaymentService {
    public double calculate (double loanAmount, double interestRate, double creditTerm){
        double monthlyPayment;
        double monthInterestRate = interestRate / (12 * 100);
        monthlyPayment = (loanAmount * monthInterestRate * Math.pow((1+monthInterestRate) , creditTerm)) / (Math.pow((1+monthInterestRate) , creditTerm) - 1);
        return monthlyPayment;
    }
}
