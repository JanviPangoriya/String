package question3;

public class Question32 {
    private String input;
    private String vowel = "AEIOUaeiou";

    Question32(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String output() {
        for (int i = 0; i < vowel.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (vowel.charAt(i) == input.length()) {
                    input = input.replace(input.charAt(j), '*');
                }

            }

        }
        return input;
    }
}

