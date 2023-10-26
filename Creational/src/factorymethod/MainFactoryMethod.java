package factorymethod;

public class MainFactoryMethod {

    public static void main(String[] args) {
        MailFactory factory = new MailFactory();

        Mail airMail = factory.createMail("AirMail");
        Mail groundMailByPlane = factory.createMail("GroundMailByPlane");
        Mail groundMailByTruck = factory.createMail("GroundMailByTruck");
        Mail groundMailByTrain = factory.createMail("GroundMailByTrain");

        airMail.deliver();
        groundMailByPlane.deliver();
        groundMailByTruck.deliver();
        groundMailByTrain.deliver();
    }
}
