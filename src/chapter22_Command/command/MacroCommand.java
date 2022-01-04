package chapter22_Command.command;

import java.util.Iterator;
import java.util.Stack;

/** '복수의 명령을 모은 명령'을 표현하는 클래스 */
public class MacroCommand implements Command {
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator it = commands.iterator();

        while (it.hasNext()) {
            ((Command) it.next()).execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
