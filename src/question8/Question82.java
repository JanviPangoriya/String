package question8;

public class Question82 {
    protected String string;

    Question82(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int uppercaseweigth() {
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                j = j + (int) string.charAt(i);
            }
        }
        return j;

    }


}
