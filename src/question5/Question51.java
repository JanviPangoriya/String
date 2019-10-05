package question5;

public class Question51 {
    protected String string;
    protected String substring;
    protected String replacestring;

    Question51(String string, String substring, String replacestring) {
        this.replacestring = replacestring;
        this.string = string;
        this.substring = substring;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getReplacestring() {
        return replacestring;
    }

    public void setReplacestring(String replacestring) {
        this.replacestring = replacestring;
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }
}
