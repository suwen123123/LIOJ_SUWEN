public class OperationFactory {
    public static Operation createOperator(String operation) throws IllegalArgumentException {
        switch (operation) {
            case "+":
                return new Add();
            case "-":
                return new Sub();
            case "*":
                return new Mul();
            case "/":
                return new Div();
            default:
                throw new IllegalArgumentException("運算符號輸入有誤");
        }
    }
}
