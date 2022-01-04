package chapter21_Proxy;

/** 이름있는 프린터를 나타내는 클래스 (본인) */
public class Printer implements Printable {
    private String name;
    
    public Printer() {
        
    }
    
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name + ")을 생성 중");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    
    public void heavyJob(String msg) {
        System.out.print(msg);
        
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.print(".");
        }

        System.out.println("완료");
    }
}
