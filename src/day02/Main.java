package day02;
//--
import java.io.*;
import java.util.Scanner;
//--
public class Main {
    //--
    public static String fullCode;
    public static String[] splitCode;
    public static Range[] ranges;
    public static long count = 0;
    //--
    public static void fileReader(Scanner in){
        fullCode = in.nextLine();
        splitCode = fullCode.split(",");
        ranges = new Range[splitCode.length];
        for(int i = 0; i < splitCode.length; i++){
            String[] splitRange = splitCode[i].split("-");
            ranges[i] = new Range(splitRange[0],splitRange[1]);
        }
    }
    //--
    public static void fileProcess(){
        Iterator it = new Iterator(ranges);
        while(it.hasNext()){
            Range r = it.next();
            r.processRange();
            count += r.getInvalidID();
        }
    }
    //--
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("src/day02/input.txt"));
        fileReader(in);
        fileProcess();
        System.out.println(count);
        in.close();
        //RESPOSTA PARTE 1 - 31210613313
        //RESPOSTA PARTE 2 -
    }
}
