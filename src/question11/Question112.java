package question11;

public class Question112 {
    protected String string;
    protected char c;

    Question112(String string, char c) {
        this.string = string;
        this.c = c;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int output() {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                return i;
            }

        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
