package command;
import java.util.ArrayList;
import java.util.List;

public class CommandHistory {

    private List<Command> history = new ArrayList<>();

    // Last in...
    public void push(Command c) {
        history.add(c);
    }

    // ...first out
    public Command pop() {
        if (!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            Command command = history.get(lastIndex);
            history.remove(lastIndex);
            return command;
        }
        return null;
    }
}
