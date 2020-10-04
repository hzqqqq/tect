package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Fabian {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8881);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        byte [] bytes =new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到谢谢".getBytes());
        socket.close();
        server.close();



    }

}
