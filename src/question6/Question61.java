package question6;

public class Question61 {
    protected String sub;

    Question61(String sub) {
        this.sub = sub;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String output() {
        return sub.toUpperCase();
    }
}
