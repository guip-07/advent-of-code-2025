package day04;
import java.io.*;
import java.util.Scanner;
//--
public class Main {
    public static int COUNT = 0;
    public static char[][] MAP = new char[137][137];
    public final static char ROLL = '@';
    //--
    public static void fileReader(Scanner in){
        for(int i = 0; i < 137; i++){
            String line = in.nextLine();
            for(int j = 0; j < 137; j++){
                MAP[i][j] = line.charAt(j);
            }
        }
    }
    //--
    public static void fileProcess(){
        for(int i = 0; i < 137; i++){
            for(int j = 0; j < 137; j++){
                if(MAP[i][j] == ROLL) verifyPosition(i,j);
            }
        }
    }
    //--
    public static void verifyPosition(int x, int y){
        int count = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(((x+i)>=0)&&((x+i)<=136)&&((y+j)>=0)&&((y+j)<=136)) {
                    if (MAP[x + i][y + j] == ROLL) count++;
                }
            }
        }
        if(count <= 4) COUNT++;
    }
    //--
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("src/day04/input.txt"));
        fileReader(in);
        fileProcess();
        System.out.println(COUNT);
        in.close();
        //RESPOSTA 1 - 1411
        //RESPOSTA 2 -
    }
}
