package day04;

import java.io.*;
import java.util.Scanner;

//--
public class Main {
    public static int COUNT = 0;
    public static char[][] MAP = new char[137][137];
    public final static char ROLL = '@';

    //--
    public static void fileReader(Scanner in) {
        for (int i = 0; i < 137; i++) {
            String line = in.nextLine();
            for (int j = 0; j < 137; j++) {
                MAP[i][j] = line.charAt(j);
            }
        }
    }

    //--
    public static void fileProcess() {
        int removed;
        do {
            removed = 0;
            boolean[][] toRemove = new boolean[137][137];

            for (int i = 0; i < 137; i++) {
                for (int j = 0; j < 137; j++) {
                    if (MAP[i][j] == ROLL) {
                        if (verifyPosition(i, j)) {
                            toRemove[i][j] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < 137; i++) {
                for (int j = 0; j < 137; j++) {
                    if (toRemove[i][j]) {
                        MAP[i][j] = '.';
                        COUNT++;
                        removed++;
                    }
                }
            }
        } while (removed > 0);
    }

    public static boolean verifyPosition(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;
                if (nx >= 0 && nx < 137 && ny >= 0 && ny < 137) {
                    if (MAP[nx][ny] == ROLL) count++;
                }
            }
        }
        return count <= 4;
    }
    //--
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/day04/input.txt"));
        fileReader(in);
        fileProcess();
        System.out.println(COUNT);
        in.close();
        //RESPOSTA 1 - 1411
        //RESPOSTA 2 - 8557
    }
}
