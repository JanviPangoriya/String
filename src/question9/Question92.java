package question9;

public class Question92 {
    private String string;

    Question92(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int absolute_weight() {
        int j = 0;
        int k = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                k = k + (int) string.charAt(i);
            }
            if (Character.isLowerCase(string.charAt(i))) {
                j = j + string.charAt(i);
            }
        }
        if ((k - j) >= 0)
            return k - j;
        else
            return (j - k);
    }
}
