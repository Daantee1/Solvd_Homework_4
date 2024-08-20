import Interfaces.IDig;
import Interfaces.IJump;

public class Dog extends Animal implements IDig, IJump {


    @Override
    public void dig() {
        System.out.println("Dog is digging");
    }

    @Override
    public void jump() {
        System.out.println("Dog is jumping");
    }
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }



}
