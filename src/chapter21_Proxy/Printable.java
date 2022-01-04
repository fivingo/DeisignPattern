package chapter21_Proxy;

/** Printer와 PrintProxu 공통의 인스턴스 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
