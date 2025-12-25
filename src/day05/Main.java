package day05;
//--
import java.io.*;
import java.util.Scanner;
//--
public class Main {
    //--
    public static int COUNT = 0;
    public static Gap[] gaps = new Gap[182];
    //--
    public static void fileReader(Scanner in){
        for(int i = 0; i< 182; i++){
            gaps[i] = new Gap(in.nextLine());
        }
        in.nextLine();
    }
    //--
    public static void fileProcess(Scanner in){
        while(in.hasNextLine()){
            long number = in.nextLong();
            for(int i = 0; i < 182; i++){
                if(gaps[i].checkGAP(number)){
                    COUNT++;
                    break;
                }
            }

        }
    }
    //--
    public static void main(String[] args)throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("src/day05/input.txt"));
        fileReader(in);
        fileProcess(in);
        System.out.println(COUNT);
        in.close();
        //RESPOSTA 1 - 615
        //RESPOSTA 2 -
    }
}
