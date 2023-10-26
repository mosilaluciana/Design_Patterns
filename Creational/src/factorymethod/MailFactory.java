package factorymethod;

public class MailFactory {
    public Mail createMail(String type){
        if (type.equals("AirMail")) {
            return new AirMail();
        } else if (type.equals("GroundMailByPlane")) {
            return new GroundMail(new Plane());
        } else if (type.equals("GroundMailByTruck")) {
            return new GroundMail(new Truck());
        } else if (type.equals("GroundMailByTrain")) {
            return new GroundMail(new Train());
        } else {
            return null;
        }
    }
}
