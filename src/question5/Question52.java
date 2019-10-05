package question5;

import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String sub = obj.next().trim();
        Question51 obj1 = new Question51(sub);
        System.out.println(obj1.output());
    }
}
