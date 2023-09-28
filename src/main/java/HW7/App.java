package HW7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        iCalculable calculator = new Calculator(0, 0);

        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }

}
