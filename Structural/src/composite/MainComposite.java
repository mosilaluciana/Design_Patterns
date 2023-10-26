package composite;

public class MainComposite {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();

        Graphic[] selectedComponents = {new Dot(3, 4), new Circle(8, 7, 15)};
        editor.groupSelected(selectedComponents);
    }
}
