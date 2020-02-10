package www.bit.java.io; 

import java.io.File;
import java.io.FileReader; 
import java.io.Reader;

public class TestReader {
public static void main(String[] args) throws Exception{
// 1.定义文件路径
File file = new File(File.separator + "Users" + File.separator + File.separator 
                      + "Desktop" + File.separator + "hello.txt";
 // 2.必须保证文件存在才能进行处理
            if (file.exists()) {
            Reader in = new FileReader(file) ; 
            char[] data = new char[1024] ; 
            int len = in.read(data) ; 
       // 将数据读取到字符数组中 
       String result = new String(data, 0, len) ;
       System.out.println("读取内容+"result") ;
       in.close(); 
       }
       }
      } 
       
