package chapter15_Facede.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/** 메일 주소에서 사용자 이름을 얻는 클래스 */
public class Database {
    private Database() {        // new에서 인스턴스를 생성시키지 않기 위한 private 선언
    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }

        return prop;
    }
}
