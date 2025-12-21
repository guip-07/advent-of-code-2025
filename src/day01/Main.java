package day01;
import java.util.Scanner;
import java.io.*;
//--
public class Main{
    public static int DIAL_POSITION = 50;
    public static int MAX_POSITION = 99;
    public static int COUNT = 0;
    public static String[] moves = new String[4780];
    public static char LEFT = 'L';
    public static char RIGHT = 'R';
    //--
    public static void readFile(Scanner in){
        int i = 0;
        while(in.hasNextLine() && i < moves.length){
            moves[i] = in.nextLine();
            i++;
        }
    }
    //--
    public static void processFile(){
        Iterator it = new Iterator(moves);
        while(it.hasNext()){
            String command = it.next();
            char direction = command.charAt(0);
            int value = Integer.parseInt(command.substring(1).trim());
            //--
            if(direction == LEFT){
                DIAL_POSITION = (DIAL_POSITION - value) % 100;
                if(DIAL_POSITION<0){ DIAL_POSITION+=100; }
            }
            if(direction == RIGHT){
                DIAL_POSITION = (DIAL_POSITION + value) % 100;
            }
            //--
            verifyPosition();
        }
    }
    //--
    //--
    public static void verifyPosition(){
        if(DIAL_POSITION==0){
            COUNT++;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("src/day01/input.txt"));
        readFile(in);
        processFile();
        System.out.println(COUNT);
        in.close();
    }
}

