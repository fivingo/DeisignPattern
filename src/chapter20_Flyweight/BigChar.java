package chapter20_Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** '큰 문자'를 나타내는 클래스 */
public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/chapter20_Flyweight/bigDigits/big" +charname + ".txt")
            );

            String line;
            StringBuffer buf = new StringBuffer();

            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }

            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
