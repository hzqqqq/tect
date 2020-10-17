package 考核题目二;


import java.io.*;

public class readAndWrite implements Runnable {
    private volatile int len = 0;
    private byte[] bytes;
    private static volatile InputStream is;
    static {
            try {
            is = new FileInputStream("G:\\java\\base\\study\\src\\考核题目二\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static volatile OutputStream os;

    static {
        try {
            os = new FileOutputStream("G:\\java\\base\\study\\src\\考核题目二\\b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//    {
//        try {
//            is = new FileInputStream("G:\\java\\base\\study\\src\\考核题目二\\a.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//        {
//    try {
//        os = new FileOutputStream("G:\\java\\base\\study\\src\\考核题目二\\b.txt");
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    }

    @Override
    public  void run() {
        while (len != -1) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            try {
                bytes = new byte[1024];
                len = is.read(bytes);
                if (len != -1) {
                    os.write(bytes, 0, len);
                }
                System.out.println(Thread.currentThread().getName() + "读取并且写入文件");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

