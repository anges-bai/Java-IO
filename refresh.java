package www.bit.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class TestWriter {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separator + "Users" + File.separator
                + File.separator + "Desktop" + File.separator + "hello.txt");
        if (!file.getParentFile().exists()) {
            // 必须保证父目录存在
            file.getParentFile().mkdirs();
            // 创建多级父目录 
        }
        String msg = "java\n";
        Writer out = new FileWriter(file, true);
        out.write(msg);
        out.flush(); 
        // 写上此语句表示强制清空缓冲内容，所有内容都输出。
        }
}
