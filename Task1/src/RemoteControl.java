import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandStack;

    public RemoteControl(int i) {
        onCommands = new Command[7];
        offCommands = new Command[7];
        commandStack = new Stack<>();

        Command onCommand = new Command() {
            @Override
            public void execute() {}
            @Override
            public void undo() {}
        };
    }
    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonWasPressed(int index) {
        onCommands[index].execute();
        commandStack.push(onCommands[index]);
    }

    public void offButtonWasPressed(int index) {
        offCommands[index].execute();
        commandStack.push(offCommands[index]);
    }

    public void undoButtonWasPressed() {
        if (!commandStack.empty()) {
            commandStack.pop().undo();
        }else{
            System.out.println("No Commands undo.");
        }
    }
}
