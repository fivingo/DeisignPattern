package chapter11_Composite;

/** 동작 테스트용 클래스 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");

            Diretory rootdir = new Diretory("root");
            Diretory bindir = new Diretory("bin");
            Diretory tmpdir = new Diretory("tmp");
            Diretory usrdir = new Diretory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));

            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries...");

            Diretory Kim = new Diretory("Kim");
            Diretory Lee = new Diretory("Lee");
            Diretory Park = new Diretory("Park");

            usrdir.add(Kim);
            usrdir.add(Lee);
            usrdir.add(Park);

            Kim.add(new File("diary.html", 100));
            Kim.add(new File("Composite.html", 200));
            Lee.add(new File("memo.tex", 300));
            Park.add(new File("game.doc", 400));
            Park.add(new File("junk.mail", 500));

            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}