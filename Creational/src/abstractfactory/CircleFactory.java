package abstractfactory;

public class CircleFactory extends AbstractFactory{
    Shape createShape(){
        return  new Circle();
    }
}
