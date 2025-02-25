public class Citizen extends Calculator {
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
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                div(a, b);
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
