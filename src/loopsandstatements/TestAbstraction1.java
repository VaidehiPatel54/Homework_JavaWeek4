package loopsandstatements;
/*4. Create forth class name TestAbstraction1 and inside create main
//method as bellow.
In real scenario, method is called by programmer or user*/

public class TestAbstraction1 {

    public static void main(String[] args) {
        Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}

