package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a = obj.nextLine().trim();
        System.out.print("index:\t");
        Output obj1 = new Output(a);
        System.out.println(obj1.index());
        System.out.print("chars:\t");
        System.out.println(obj1.chara());

    }
}
