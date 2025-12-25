package day05;
//--

import java.io.*;
import java.util.Scanner;

//--
public class Main {
    //--
    public static long COUNT = 0;
    public static Gap[] gaps = new Gap[182];

    //--
    public static void fileReader(Scanner in) {
        for (int i = 0; i < 182; i++) {
            gaps[i] = new Gap(in.nextLine());
        }
        in.nextLine();
    }

    //--
    public static void fileProcess(Scanner in) {
        for (int i = 0; i < 181; i++) {
            for (int j = 0; j < 181 - i; j++) {
                if (gaps[j].getStart() > gaps[j + 1].getStart()) {
                    Gap temp = gaps[j];
                    gaps[j] = gaps[j + 1];
                    gaps[j + 1] = temp;
                }
            }
        }
        //--
        long currentStart = gaps[0].getStart();
        long currentEnd = gaps[0].getEnd();
        long totalUnique = 0;
        //--
        for (int i = 1; i < 182; i++) {
            if (gaps[i].getStart() <= currentEnd) {
                currentEnd = Math.max(currentEnd, gaps[i].getEnd());
            } else {
                totalUnique += (currentEnd - currentStart + 1);
                currentStart = gaps[i].getStart();
                currentEnd = gaps[i].getEnd();
            }
        }
        totalUnique += (currentEnd - currentStart + 1);
        COUNT = totalUnique;
    }

    //--
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/day05/input.txt"));
        fileReader(in);
        fileProcess(in);
        System.out.println(COUNT);
        in.close();
        //RESPOSTA 1 - 615
        //RESPOSTA 2 - 353716783056994
    }
}
