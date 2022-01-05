package chapter23_Interpreter;

/** <primitive command>에 대응하는 클래스 */
// <rpimitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);

        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    public String toString() {
        return name;
    }
}
