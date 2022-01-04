package chapter22_Command.drawer;

import chapter22_Command.command.Command;

import java.awt.Point;

/** '점 그리기 명령'을 표현하는 클래스 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
