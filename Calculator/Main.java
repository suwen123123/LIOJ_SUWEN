import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數字: ");
        int userInputNum1 = scanner.nextInt();

        System.out.println("請輸入運算符號: ");
        String userInputOperator = scanner.next();

        System.out.println("請輸入第二個數字: ");
        int userInputNum2 = scanner.nextInt();

        Operation operation = OperationFactory.createOperator(userInputOperator);
        double result = operation.getResult(userInputNum1, userInputNum2);

        System.out.println(userInputNum1 + " " + userInputOperator + " " + userInputNum2 + " = " + result);

        scanner.close();
    }

}
