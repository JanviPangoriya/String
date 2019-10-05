package question10;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.next().trim();
        char c = obj.next().trim().charAt(0);
        Question101 obj1 = new Question101(string, c);
        System.out.println(obj1.index());
    }
}
