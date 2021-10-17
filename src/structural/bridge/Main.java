package structural.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SamsungTV());
        remoteControl.turnOn();

    }
}
