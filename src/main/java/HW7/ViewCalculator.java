package HW7;

import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double realPart = promptDouble("Введите действительную часть первого аргумента: ");
            double imaginaryPart = promptDouble("Введите мнимую часть первого аргумента: ");

            Calculator arg1 = new Calculator(realPart, imaginaryPart);

            while (true) {
                String cmd = prompt("Введите операцию (*, +, /) : ");
                switch (cmd) {
                    case "*":
                        double realArg = promptDouble("Введите действительную часть второго аргумента: ");
                        double imaginaryArg = promptDouble("Введите мнимую часть второго аргумента: ");

                        Calculator arg2 = new Calculator(realArg, imaginaryArg);

                        calculator.multiply(arg2);
                        break;
                    case "+":
                        realArg = promptDouble("Введите действительную часть второго аргумента: ");
                        imaginaryArg = promptDouble("Введите мнимую часть второго аргумента: ");

                        arg2 = new Calculator(realArg, imaginaryArg);

                        calculator.sum(arg2);
                        break;
                    case "/":
                        realArg = promptDouble("Введите действительную часть второго аргумента: ");
                        imaginaryArg = promptDouble("Введите мнимую часть второго аргумента: ");

                        arg2 = new Calculator(realArg, imaginaryArg);

                        try{
                            calculator.divide(arg2);
                        }catch(ArithmeticException e){
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
//                    case "=":
//                        System.out.printf("Результат: %s\n", calculator.toString());
//                        break;
                    default:
                        System.out.println("Неверная операция");
                        continue;
                }
                System.out.printf("Результат: %s\n", calculator.toString());
                cmd = prompt("Хотите выполнить еще одно вычисление (Y/N)?");
                if (cmd.equalsIgnoreCase("N")) {
                    break;
                }
            }

            String cmd = prompt("Хотите выполнить еще одно вычисление (Y/N)?");
            if (cmd.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
