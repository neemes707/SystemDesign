package DesignPatterns.CommandDesignPattern;

public class CommandPatternTesting {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(4);
        Light light = new Light();
        Fan fan1 = new Fan();

        remoteController.setCommand(new LightCommand(light),0);
        remoteController.setCommand(new FanCommand(fan1),1);

        remoteController.executeCommand(1);
        remoteController.executeCommand(0);

        remoteController.executeCommand(1);
        remoteController.executeCommand(0);
    }
}
