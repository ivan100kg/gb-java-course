package lessons.lesson3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {
    public static void main(String[] args) {
//        try {
//            ServerSocket serverSocket = new ServerSocket(8000);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println(1);
//            int x = 10 / 0;
//            System.out.println(2);
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        System.out.println(3);
        try {
            ReportMaker.makePDFReport("1.txt", "al;skdfjfasdlkj");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
            out.write(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream out2 = new FileOutputStream("2.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        //-----------------------------
//        throw new MyLibException();
        throw new MyLibException("hi");
    }

    public static void a() {
        b();
    }

    public static void b() {
        int x = 10 / 0;
    }

    public static void doSomething() throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("1.txt");
    }

}
