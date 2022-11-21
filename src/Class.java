import java.util.Arrays;

public class Class {
    private int num;
    private String word;
    private int[] num1;

    public Class(int num) {
        this.num = num;
    }

    public Class(int num, String word, int[] num1) {
        this.num = num;
        this.word = word;
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "Class{" +
                "num=" + num +
                ", word='" + word + '\'' +
                ", num1=" + Arrays.toString(num1) +
                '}';
    }
}
