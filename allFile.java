package www.bit.java.io;

import java.io.File;

public class TestIO {
    public static void main(String[] args) {
        File file = new File(File.separator + "Users" + File.separator + "yuisama" + File.separator + "Desktop");
        listAllFiles(file);
        // 从此处开始递归 
    }

    /**** this methods is used for 列出指定目录中的全部子目录信息
     * */
    public static void listAllFiles(File file) {
        if (file.isDirectory()) {
            // 现在给定的file对象属于目录 
            File[] result = file.listFiles();
            // 继续列出子目录内容 
            if (result != null) {
                for (File file2 : result) {
                    listAllFiles(file2);
                }
            }
        } else {
            // 给定的file是文件，直接打印 
            System.out.println(file);
        }
    }
}
