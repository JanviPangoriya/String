package question10;

public class Question101 {
    protected String string;
    protected char c;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int index() {
        return string.indexOf(c);
    }

    Question101(String string, char c) {
        this.string = string;
        this.c = c;
    }

}
