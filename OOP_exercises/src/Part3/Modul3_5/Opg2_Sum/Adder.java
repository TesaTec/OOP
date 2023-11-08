package Part3.Modul3_5.Opg2_Sum;

public class Adder {
    public static int sum(int[] numbers) {
        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main (String[] args) {
        int[] testcase1 = {1, 3, 5, 2, 3, 7};
        int[] testcase2 = {5, 6, 2, 3};

        System.out.println(sum(testcase1));
        System.out.println(sum(testcase2));
    }
}

