package DesignPatterns.CommandDesignPattern;

public class RemoteController {
    private int numButtons;
    private ICommand []commands;
    private boolean []isButtonPressed;
    public RemoteController(int numButtons){
        this.numButtons  = numButtons;
        commands = new ICommand[numButtons];
        isButtonPressed = new boolean[numButtons];
        for(int i  = 0; i < numButtons; i++){
            commands[i] = null;
            isButtonPressed[i] = false;
        }
    }

    public void setCommand(ICommand command,int index){
        if(index >= 0 && index < commands.length){
            commands[index] = command;
        }else{
            System.out.println("Can't set command at this index");
        }
    }

    public void executeCommand(int index){
        if(index >= 0 && index < commands.length){
            if(commands[index] != null){
                if(isButtonPressed[index]){
                    commands[index].undo();
                    isButtonPressed[index] = false;
                }else{
                    commands[index].execute();
                    isButtonPressed[index] = true;
                }
            } else{
                System.out.println("No command initialized at this index");
            }
        }
    }
}
