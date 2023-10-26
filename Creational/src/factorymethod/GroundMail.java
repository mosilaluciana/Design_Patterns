package factorymethod;

public class GroundMail extends Mail{

    private  Transport transport;
    GroundMail(Transport transport){
        this.transport =transport;
    }
     void deliver(){transport.deliverByGround();}
}
