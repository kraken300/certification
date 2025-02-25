public class Casio extends Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public void displayResult(int a, int b, int choice) {
        switch (choice) {
            case 1:
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + sub(a, b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + mul(a, b));
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + div(a, b));
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

}
