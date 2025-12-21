package day01;
import java.util.Scanner;
import java.io.*;
//--
public class Main{
    public int DIAL_START_POSITION = 50;
    public int COUNT = 0;
    public char LEFT = 'L';
    public char RIGHT = 'R';
    //--
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        String test = in.next();
        System.out.println(test);
        in.close();

    }
}

