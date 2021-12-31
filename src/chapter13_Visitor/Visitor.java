package chapter13_Visitor;

/** 파일과 디렉터리를 방문하는 방문자를 나타내는 추상 클래스 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
