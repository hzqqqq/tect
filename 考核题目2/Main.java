package 考核题目二;

public class Main {
    public static void main(String[] args) {
        readAndWrite raw = new readAndWrite();
        //测试多线程执行的效率与线程的个数量的关系
        long l = System.currentTimeMillis();
        //开启多个线程来执行读取文件的操作
        Thread one = new Thread(raw,"线程A");
        one.start();
        Thread two = new Thread(raw,"线程B");
        two.start();
        Thread three = new Thread(raw,"线程C");
        three.start();
        Thread four = new Thread(raw,"线程D");
        four.start();
       try{
           one.join();//加入到主线程 使主线程等待 便于测试多线程的效率
           two.join();
           three.join();
           four.join();
       }catch (Exception e){
           e.printStackTrace();
       }

        long l1 = System.currentTimeMillis();
        System.out.println("耗时间为： " + (l1-l) + "毫秒");
    }
}
