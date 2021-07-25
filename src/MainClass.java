import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class MainClass extends Object {


    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("textHW6_1.txt", false);
            byte[] str = " \n              Yesterday\n \nYesterday, all my troubles seemed so far away\nNow it looks as though they're here to stay\nOh, I believe in yesterday\nSuddenly, I'm not half the man I used to be\nThere's a shadow hanging over me\nOh, yesterday came suddenly\n".getBytes();
            fos.write(str);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileOutputStream fos1 = new FileOutputStream("textHW6_2.txt", false);
            byte[] str = " \n               Chorus:\nWhy she had to go I don't know, she wouldn't say\nI said something wrong, now I long for yesterday\nYesterday, love was such an easy game to play\nOh, I believe in yesterday \n \n \n  https://101.ru/radio/channel/55  \n \n ".getBytes();
            fos1.write(str);
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("textHW6_1.txt");
            int outbox;
            int outbox2;
            while (((outbox = fis.read())) != -1) {
                System.out.print((char) outbox);
            }
            fis.close();

            FileInputStream fis1 = new FileInputStream("textHW6_2.txt");


            while (((outbox = fis1.read())) != -1) {
                System.out.print((char) outbox);
            }
            fis1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/
