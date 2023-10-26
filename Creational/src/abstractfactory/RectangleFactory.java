package abstractfactory;

public class RectangleFactory extends AbstractFactory{
    Shape createShape(){
        return  new Rectangle();
    }
}
