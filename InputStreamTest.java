import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: BaiMiao
 * @Description:
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        System.out.print("请输入内容：");
        byte[] data=new byte[1024];
        int len=in.read(data);
        System.out.println("输入内容为："+new String(data,0,len));
    }
}
