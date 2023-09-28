package HW7;

public class Calculator implements iCalculable{
    private double realPart;
    private double imaginaryPart;

    public Calculator(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public iCalculable sum(iCalculable arg) {
        double realArg = ((Calculator)arg).realPart;
        double imaginaryArg = ((Calculator)arg).imaginaryPart;

        this.realPart += realArg;
        this.imaginaryPart += imaginaryArg;

        return this;
    }

    @Override
    public iCalculable multiply(iCalculable arg) {
        double realArg = ((Calculator)arg).realPart;
        double imaginaryArg = ((Calculator)arg).imaginaryPart;

        double newRealPart = (this.realPart * realArg) - (this.imaginaryPart * imaginaryArg);
        double newImaginaryPart = (this.realPart * imaginaryArg) + (this.imaginaryPart * realArg);

        this.realPart = newRealPart;
        this.imaginaryPart = newImaginaryPart;

        return this;
    }

    @Override
    public iCalculable divide(iCalculable arg) {
        double realArg = ((Calculator)arg).realPart;
        double imaginaryArg = ((Calculator)arg).imaginaryPart;

        double denominator = (realArg * realArg) + (imaginaryArg * imaginaryArg);

        if(denominator == 0){
            throw new ArithmeticException("Division by zero");
        }

        double newRealPart = ((this.realPart * realArg) + (this.imaginaryPart * imaginaryArg)) / denominator;
        double newImaginaryPart = ((this.imaginaryPart * realArg) - (this.realPart * imaginaryArg)) / denominator;

        this.realPart = newRealPart;
        this.imaginaryPart = newImaginaryPart;

        return this;
    }

    @Override
    public String toString() {
        if(imaginaryPart == 0){
            return String.format("%.2f", realPart);
        }else if(realPart == 0){
            return String.format("%.2fi", imaginaryPart);
        }else{
            return String.format("%.2f %s %.2fi", realPart, imaginaryPart > 0 ? "+" : "-", Math.abs(imaginaryPart));
        }
    }
}
