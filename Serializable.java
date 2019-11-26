import java.io.File;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectOutputStream; 
import java.io.Serializable; 
@SuppressWarnings("serial") 
class Person implements Serializable{ 
    private String name ;
    private int age ; 
    public Person(String name, int age) { 
        super(); this.name = name; 
        this.age = age; 
    }
    @Override
    public String toString() { 
        return "Person [name=" + name + ", age=" + age + "]"; 
    } 
}
public class TestPrint {
    public static final File FILE = new File(
            "/Users/yuisama/Desktop/testSer.txt") ;
    public static void main(String[] args) throws Exception { 
        ser(new Person("yuisama", 25)) ; 
    }
    public static void ser(Object obj) throws FileNotFoundException, 
            IOException { 
        ObjectOutputStream oos = new ObjectOutputStream(new 
                FileOutputStream(FILE)) ; oos.writeObject(obj ) ; 
                oos.close() ; 
    }
}
