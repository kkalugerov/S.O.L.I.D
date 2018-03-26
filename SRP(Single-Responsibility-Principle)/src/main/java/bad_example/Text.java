package bad_example;

public class Text {
    private String text;
    private String author;
    private int length;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return "text";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    /*methods that change the text*/
    public void allLettersToUpperCase(String text) { ... }
    public void findSubTextAndDelete(String s) { ... }

    /*method for formatting output*/
    public void printText() { ... }
}
