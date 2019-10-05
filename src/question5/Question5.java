package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String string = obj.nextLine().trim();
        String substring = obj.nextLine().trim();
        String replacestring = obj.nextLine().trim();
        Question51 obj1 = new Question51(string, substring, replacestring);
        System.out.println(obj1.inputstring());
    }
}
