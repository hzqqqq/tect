package 考核题目二;

public class Main {
    public static void main(String[] args) {
        //测试增加线程的运行时间
        readAndWrite raw = new readAndWrite();
        long l = System.nanoTime();//当前时间
        //开启多个线程来执行读取文件的操作
        new Thread(raw,"线程A").start();
        new Thread(raw,"线程B").start();
        new Thread(raw,"线程C").start();
        long l1 = System.nanoTime();
        System.out.println("耗时间为: " + (l1 - l) + "纳秒");
    }
}
