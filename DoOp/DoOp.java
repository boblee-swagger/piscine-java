

public class DoOp {
    public static String operate(String[] args) {

        if (args.length == 3) {
            int leftOperand = Integer.parseInt(args[0]);
            int rightOperand = Integer.parseInt(args[2]);
            String operand = args[1];
            int result = 0;

            switch (operand) {
                    case "+" -> result = leftOperand + rightOperand;
                    case "-" -> result = leftOperand - rightOperand;
                    case "*" -> result = leftOperand * rightOperand;
                    case "%" -> {
                        if (rightOperand != 0) {
                            result = leftOperand % rightOperand;
                        } else {
                            System.out.println("Error\nit depends on the input.");
                            System.exit(0);
                        }
                    }
                    case "/" -> {
                        if (rightOperand != 0) {
                            result = leftOperand / rightOperand;
                        } else {
                            System.out.println("Error\nit depends on the input.");
                            System.exit(0);
                        }
                    }
                    default -> System.out.println("Error");
            }
            return Integer.toString(result);
        }
        System.out.println("Error\nit depends on the input.");
        return "Error";   
    }

    public static void main(String[] args) {
        System.out.println(operate(new String[]{"1","+","2"}));
        System.out.println(operate(new String[]{"1","-","1"}));
        System.out.println(operate(new String[]{"1","%","0"}));
        System.out.println(operate(args));
    }
}