import java.io.File;

/**
 * @Author: BaiMiao
 * @Description:
 * 列出目录中所有级的信息，递归实现
 * File提供的isDirectory（）方法只能列出目录中的一级信息。
 */
public class TestIO {
    public static void main(String[] args) {
        File file=new File(File.separator+"F:"+File.separator+
                "user"+File.separator+"bm");
        long start=System.currentTimeMillis();
        listAllFiles(file);
        long end=System.currentTimeMillis();
        System.out.println("所需时间为："+(end-start)+"毫秒");
    }
    public static void listAllFiles(File file){
        if(file.isDirectory()){
            File[] result=file.listFiles();
            if(result!=null){
                for(File file2:result){
                    listAllFiles(file2);
                }
            }
        }else{
            System.out.println(file);
            //file.delete();则变成一个恶意程序
        }
    }
}
