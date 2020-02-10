package www.bit.java.io;

class Message implements AutoCloseable {
    public Message() {
        System.out.println("创建一条新的消息");
    }

    @Override
    public void close() throws Exception {
        System.out.println("[AutoCloseable]自动关闭方法");
    }

    public void print() {
        System.out.println("www.bit.java");
    }
}

public class TestAutoClose {
    public static void main(String[] args) {
        try (Message msg = new Message()) {
            // 必须在try中定义对象
            msg.print();
        } catch (Exception e) {
        }
    }
}
