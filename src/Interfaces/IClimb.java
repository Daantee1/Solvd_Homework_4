package Interfaces;

public interface IClimb {

    void climb();

    default void climbStatus(){
        System.out.println("Climb interface");
    }
}
