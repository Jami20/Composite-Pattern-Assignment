public class Structures implements Shape {
    String name;

    public Structures(String name) {
        super();
        this.name = name;
    }

    public void showShapeType() {
        System.out.println(name);
    }
}
