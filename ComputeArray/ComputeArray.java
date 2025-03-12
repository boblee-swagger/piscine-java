public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null; 
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            if (item % 3 == 0) {
                result[i] = item * 5;
            } else if (item % 3 == 1) {
                result[i] = item + 7;
            } else {
                result[i] = item;
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