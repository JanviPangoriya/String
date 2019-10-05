package question4;

public class Question42 {
    protected String s1 = "";
    protected String s2 = "";
    protected String s3 = "";

    Question42(String input) {
        s2 = input.toLowerCase();
        s3 = input;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public void output() {
        int counter = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                counter += 1;

                if (counter % 3 == 1) {
                    s1 += "*";
                } else if (counter % 3 == 2) {
                    s1 += "^";
                } else {
                    s1 += "!";
                }
            } else {
                s1 += s3.charAt(i);
            }

        }
        System.out.println(s1);
    }
}
