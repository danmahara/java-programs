package Assignment_03;

public class IntegerSum_13 {

    public static void main(String[] args) {

        int i, sum = 0, count = 0;

        for (i = 101; i < 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Number of integers " + count);
        System.out.println("Sum of integers is " + sum);
    }
}
