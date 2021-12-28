package chapter07_Builder;

/** 일반 텍스트(보통의 문자열)를 이용해서 문서를 만드는 클래스 */
public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("『" + title + "』\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ·" + items[i] + "\n");
        }

        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
