package question3;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.next().trim();
        Question32 obj1 = new Question32(input);
        System.out.println(obj1.output());

    }
}
