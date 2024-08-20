import Interfaces.IClimb;
import Interfaces.IDig;
import Interfaces.IJump;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.eat();
        dog.sleep();

        IDig dog2 = new Dog();
        dog2.dig();
        dog2.digStatus();

        IJump dog3 = new Dog();
        dog3.jump();
        dog3.jumpStatus();

        IClimb monkey = new Monkey();
        monkey.climb();
        monkey.climbStatus();

        Zoo.checkName();
        Zoo zoo = new Zoo();
        zoo.printInfo();


    }
}