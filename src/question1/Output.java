package question1;

public class Output {
    private String name;
    private String result = "";
    private String result1 = "";
    Output(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String index() {
        for (int i = 0; i < name.length(); i++) {
            result = result + i + '\t';
        }
        return result;
    }

    String chara() {
        for (int j = 0; j < name.length(); j++) {
            result1 = result1 + name.charAt(j) + '\t';
        }
        return result1;
    }
}
