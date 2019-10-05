package question9;

import java.util.Scanner;

public class Question91 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.next().trim();
        Question92 obj1 = new Question92(string);
        System.out.println(obj1.absolute_weight());
    }
}
