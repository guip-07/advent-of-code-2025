package day06;
//--

import java.util.Scanner;
import java.io.*;

//--
public class Main {
    //--
    public static long COUNT = 0;
    public static Long[] line_0 = new Long[10000];
    public static Long[] line_1 = new Long[10000];
    public static Long[] line_2 = new Long[10000];
    public static Long[] line_3 = new Long[10000];
    public static char[] line_4 = new char[10000];
    public static Problem[] problems;

    //--
    public static void fileReader(Scanner in) {
        int count = 0;
        String temp__0 = in.nextLine();
        String temp__1 = in.nextLine();
        String temp__2 = in.nextLine();
        String temp__3 = in.nextLine();
        String temp__4 = in.nextLine();
        Scanner l_0 = new Scanner(temp__0);
        Scanner l_1 = new Scanner(temp__1);
        Scanner l_2 = new Scanner(temp__2);
        Scanner l_3 = new Scanner(temp__3);
        Scanner l_4 = new Scanner(temp__4);
        for (int i = 0; i < 10000; i++) {
            if (l_0.hasNext()) {
                line_0[i] = l_0.nextLong();
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            if (l_1.hasNext()) {
                line_1[i] = l_1.nextLong();
            }
        }
        for (int i = 0; i < count; i++) {
            if (l_2.hasNext()) {
                line_2[i] = l_2.nextLong();
            }
        }
        for (int i = 0; i < count; i++) {
            if (l_3.hasNext()) {
                line_3[i] = l_3.nextLong();
            }
        }
        for (int i = 0; i < count; i++) {
            if (l_4.hasNext()) {
                line_4[i] = l_4.next().charAt(0);
            }
        }
        problems = new Problem[count];
        for (int i = 0; i < count; i++) {
            problems[i] = new Problem(line_0[i], line_1[i], line_2[i], line_3[i], line_4[i]);
        }
    }

    //--
    public static void fileProcess() {
        Iterator it = new Iterator(problems);
        while (it.hasNext()) {
            COUNT += it.next().getResult();
        }
    }

    //--
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/day06/input.txt"));
        fileReader(in);
        fileProcess();
        System.out.println(COUNT);
        in.close();
        //RESPOSTA 1 - 6172481852142
        //RESPOSTA 2 -
    }
}
