package 考核题目二;

import java.io.*;

public class readAndWrite implements Runnable {
   private Object obj = new Object();
    private InputStream is;

    {
        try {
            is = new FileInputStream("G:\\java\\base\\study\\src\\考核题目二\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private OutputStream os;

    {
        try {
            os = new FileOutputStream("G:\\java\\base\\study\\src\\考核题目二\\b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int len = 0;
    byte[] bytes;

    @Override
    public void run() {
        while (len != -1) {
            synchronized (obj) {
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

}

