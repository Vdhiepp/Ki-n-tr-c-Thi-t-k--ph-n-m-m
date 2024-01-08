package behavioral.decorator.b3;

public class Text extends Widget{
    String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
