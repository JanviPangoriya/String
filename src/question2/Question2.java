package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String as = obj.nextLine().trim();
        int index = obj.nextInt();
        Question 21 obj1 = new Question21(as, index);
        System.out.println(obj1.output());
    }
}
