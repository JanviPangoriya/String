package question11;

import java.util.Scanner;

public class Question111 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.next().trim();
        char c = obj.next().trim().charAt(0);
        Question112 obj1 = new Question112(string, c);
        System.out.println(obj1.output());
    }
}
