package www.bit.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestIO {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separator + "Users" + File.separator  + File.separator + 
                                                     "Desktop" + File.separator + "hello.txt");
        if (!file.getParentFile().exists()) {
            // 必须保证父目录存在 
            file.getParentFile().mkdirs();
            // 创建多级父目录
        }
        // OutputStream是一个抽象类，所以需要通过子类进行实例化，
        // 此时只能操作File类 
        try (OutputStream output = new FileOutputStream(file, true)) {
            // 要求输出到文件的内容 
            String msg = "Java\n";
            // 将内容变为字节数组
            output.write(msg.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
