import Interfaces.IClimb;
import Interfaces.IJump;

public class Monkey extends Animal implements IClimb, IJump {

    @Override
    public void eat() {

    }
    @Override
    public void climb(){
        System.out.println("Monkey is climbing");
    }
    @Override
    public void jump(){
        System.out.println("Monkey is jumping");
    }
}
