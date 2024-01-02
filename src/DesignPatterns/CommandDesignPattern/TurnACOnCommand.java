package DesignPatterns.CommandDesignPattern;

public class TurnACOnCommand implements ICommand{
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
