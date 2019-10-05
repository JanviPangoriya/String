package question6;

import java.util.Scanner;

public class Question62 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sub = obj.next().trim();
        Question61 obj1 = new Question61(sub);
        System.out.println(obj1.output());
    }
}
