import java.util.*;

public class Complex implements Shape {
	
    String name;
    List<Shape> shapeNames = new ArrayList<>();

    public Complex(String name) {
        super();
        this.name = name;
    }

    public void addShape(Shape shape) {
        shapeNames.add(shape);
    }

    public void showShapeType() {
        
		System.out.println(name + " contains: \n");
        
		for (Shape str : shapeNames) {
            str.showShapeType();
        }
		
        System.out.println("\n");
    }
}
