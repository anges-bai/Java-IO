import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: BaiMiao
 * @Description:智能回复客服
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        System.out.print("请问有什么需要帮助：");
        byte[] data=new byte[1024];
        int len=in.read(data);
        String str=new String(data,0,len);
        if(str.equals("你好\n"))
            System.out.println("客服小k：你好！");
        else if(str.equals("再见\n"))
            System.out.println("好的~亲");
    }
}
