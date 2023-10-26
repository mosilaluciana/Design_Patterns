package composite;

public class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        // ...
    }

    public void groupSelected(Graphic[] components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
        all.draw();
    }
}

