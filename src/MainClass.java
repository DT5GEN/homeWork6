import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class MainClass extends Object {



    private static final int FILES_AMOUNT = 10;
    private static final String SEARCH = "yesterday";

    private static FileInputStream fis;



    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("text_1.txt", false);
            byte[] str = " \n              Yesterday\n \nYesterday, all my troubles seemed so far away\nNow it looks as though they're here to stay\nOh, I believe in yesterday\nSuddenly, I'm not half the man I used to be\nThere's a shadow hanging over me\nOh, yesterday came suddenly\n".getBytes();
            fos.write(str);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileOutputStream fos1 = new FileOutputStream("text_2.txt", false);
            byte[] str = " \n               Chorus:\nWhy she had to go I don't know, she wouldn't say\nI said something wrong, now I long for yesterday\nYesterday, love was such an easy game to play\nOh, I believe in yesterday \n \n \n  https://101.ru/radio/channel/55  \n \n ".getBytes();
            fos1.write(str);
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("text_1.txt");
            int outbox;

            while (((outbox = fis.read())) != -1) {
                System.out.print((char) outbox);
            }
            fis.close();

            FileInputStream fis1 = new FileInputStream("text_2.txt");


            while (((outbox = fis1.read())) != -1) {
                System.out.print((char) outbox);
            }
            fis1.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        String[] fileNames = new String[FILES_AMOUNT];
        for (int i = 0; i < fileNames.length; i++)
            fileNames[i] = "text_" + i + ".txt";


        try {
            System.out.println("   Задание 3.   \nEсть ли слово 'yesterday' в первом файле  ? " + searchInFile(fileNames[1], SEARCH ));
            //#4
            System.out.println("\n\n\n    Задание 4.   \n Проверка на совпадение слово во всех файлах!");
            String[] result = searchMatch(fileNames, SEARCH);
            for (int i = 0; i < result.length; i++)
                if (result[i] != null)
                    System.out.println("Файл " + result[i] + " содержит искомое слово " + SEARCH);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


    }


    private static boolean searchInFile(String fileName, String search) throws IOException {
        fis = new FileInputStream(fileName);
        byte[] searchSequence = search.getBytes();
        int ch; //ABABB
        int i = 0; //ABABABB
        while ((ch = fis.read()) != -1) {
            if (ch == searchSequence[i]) {
                i++;
            } else {
                i = 0;
                if (ch == searchSequence[i]) {
                    i++;
                }
            }
            if (i == searchSequence.length) {
                fis.close();
                return true;
            }
        }
        fis.close();
        return false;
    }

    private static String[] searchMatch(String[] files, String search) throws IOException {
        String[] list = new String[files.length];
        int count = 0;
        File path = new File(new File(".").getCanonicalPath());
        File[] dir = path.listFiles();
        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory()) {
                continue;
            }
            for (int j = 0; j < files.length; j++) {
                if (dir[i].getName().equals(files[j])) {
                    if (searchInFile(dir[i].getName(), search)) {
                        list[count] = dir[i].getName();
                        count++;
                        break;
                    }
                }
            }
        }
        return list;
    }


}
/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/
