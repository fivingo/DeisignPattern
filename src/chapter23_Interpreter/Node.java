package chapter23_Interpreter;

/** 구문 트리의 '노드'가 되는 클래스 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
