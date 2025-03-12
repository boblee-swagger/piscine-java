public class DoOp {
    public static String operate(String[] args) {
        int leftOperand = Integer.parseInt(args[0]);
        int rightOperand = Integer.parseInt(args[2]);
        String operand = args[1];
        int result;
        switch (operand) {
            case "+" -> result = leftOperand + rightOperand;
            case "-" -> result = leftOperand - rightOperand;
            case "*" -> result = leftOperand * rightOperand;
            case "/" -> result = leftOperand / rightOperand;
            default -> throw new AssertionError();
        }

        return Integer.toString(result);
    }
}