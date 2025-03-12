public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null; 
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            switch (item % 3) {
                case 0:
                    result[i] = item * 5;
                    break;
                case 1:
                    result[i] = item + 7;
                    break;
                default:
                    result[i] = item;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89});
        if (array != null) {
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}