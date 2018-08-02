package helloworld.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by song on 2018/7/20.
 */

public class InputStreamReaderTest {
    public static void main(String args[]) throws Exception {

        // 构建字节输入流
        File file = new File("./Resource/test.txt");
        InputStream in = new FileInputStream(file);

        // 构建转换流
        InputStreamReader reader = new InputStreamReader(in);

        // 用转换流对字节输入流进行读取
        char[] buf = new char[1024];
        while(reader.read(buf) != -1) {
            System.out.println(String.valueOf(buf));
            System.out.println("---");
        }
    }
}
