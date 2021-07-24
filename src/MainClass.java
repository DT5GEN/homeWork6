import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainClass extends Object {

//    static Scanner scanner = new Scanner(System.in);
//    static Sample sample = new Sample();

    public static void main(String[] args) {
//        String s0 = "Hello_world";
//        String s1 = "Hello";
//        s1 += "_world";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_world";
//
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

        long starTime = System.nanoTime();
        String example = "Example"; //String example = new String("Example");

        for (int i = 0; i < 50000; i++) {
            example += i;
        }

        float deltaTime = System.nanoTime() - starTime;
        System.out.println(example);
        System.out.println("Work time string: " + deltaTime * 0.000001f + " millisec");

//
    }}
//        starTime = System.nanoTime();
//
//        StringBuilder example1 = new StringBuilder("Example");
//
//        for (int i = 0; i < 50000; i++) {
//            example1.append(i);
//        }
//
//        deltaTime = System.nanoTime() - starTime;
//        System.out.println(example1.toString());
//        System.out.println("Work time StringBuilder: " + deltaTime * 0.000001f + " millisec");
//        System.out.println(example.equals(example1.toString()));

//        String s0 = "Hello";
//        s0 += "_world";
//
//        StringBuilder s = new StringBuilder("Hello");
//        s.append("_world");
//        s.delete(0, s.length());
//        s.append("Hello!!!");
//        System.out.println("Program start");
//
////        try {
////            System.out.println(10 / 0);
////        } catch (ArithmeticException exception) {
////            System.out.println("Error! Caught " + exception.getMessage());
////        }
////        int[] arr = new int[10];
////        arr[11] = 5;
////            method1();
//        sample.doSomething();
//
//        System.out.println("Program end");

//        InputStream io;
//        OutputStream out;
//
//        FileInputStream fis; //read
//        FileOutputStream fos; //write
//
//        try {
//            FileOutputStream fos = new FileOutputStream("text.txt", true);
////            PrintStream ps = new PrintStream(fos);
//            byte[] str = "Hello world!!1222221!".getBytes();
////            ps.println("Hello!!!! WOrld!! JAva");
////            ps.close();
//            fos.write(str);
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileInputStream fis = new FileInputStream("text.txt");
//            int outbox;
//            while ((outbox = fis.read()) != -1) {
//                System.out.print((char) outbox);
//            }
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//    }

//    private static void method1() throws IOException {
//        ///...
//        throw new IOException("Exception from method");
////        try {
////        } catch (IOException exception) {
////            System.out.println(exception.getCause());
//        }
//    private static class Sample {
//        private void doSomething() {
//            System.out.println("Method from static class");
//        }


//}
/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/
