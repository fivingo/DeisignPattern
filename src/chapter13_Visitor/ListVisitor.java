package chapter13_Visitor;

import java.util.Iterator;

/** Visitor 클래스의 하위 클래스로 파일과 디렉터리의 종류를 나타내는 클래스 */
public class ListVisitor extends Visitor {
    private String currentdir = "";


    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);

        String savedir = currentdir;

        currentdir = currentdir + "/" + directory.getName();

        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();

            entry.accept(this);
        }

        currentdir = savedir;
    }
}
