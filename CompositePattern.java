public class ComplexPattern {
	
    public static void main(String[] args) {
		
        Shape square = new Structures("square");
        Shape rectangle = new Structures("rectangle");
        Shape circle = new Structures("circle");
        Shape cylinder = new Structures("cylinder");

        Complex house = new Complex("house");
        Complex tree = new Complex("tree");
        Complex waterSource = new Complex("waterSource");

        Complex village = new Complex("village");

        house.addShape(rectangle);
        house.addShape(square);

        tree.addShape(cylinder);
        tree.addShape(circle);

        waterSource.addShape(cylinder);
        waterSource.addShape(circle);

        village.addShape(house);
        village.addShape(tree);
        village.addShape(waterSource);

        // Village has house, tree and waterSource and it shows hierarchical struture
        village.showShapeType();

        //Village has house, tree and waterSource. That's why it shows a particular complex shape only
        waterSource.showShapeType();

        //shows the Structures
        square.showShapeType();
    }
}
