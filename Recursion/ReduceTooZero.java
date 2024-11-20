public class ReduceTooZero {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        if(num == 0) {
            return 0;
        }
        if(num % 2 == 0) {
            return 1 + numberOfSteps(num/2);
        } else {
            return 1 + numberOfSteps(num - 1);
        }

    }
}
