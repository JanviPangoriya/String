package question7;

public class Question72 {
    protected String input;

    Question72(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int toatalweigth() {
        int s = 0;
        for (int i = 0; i < input.length(); i++) {
            s = s + (int) (input.charAt(i));
        }
        return s;
    }
}
