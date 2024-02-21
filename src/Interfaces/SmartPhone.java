package Interfaces;

public interface SmartPhone {
    void Camera();
    void Dialer();
    void Internet();
    default void SwitchOn(){
        System.out.println("Switching on the phone");
    }
}
