package Interfaces;

public interface IJump {

    void jump();

    default void jumpStatus(){
        System.out.println("Jump interface");
    }
}
