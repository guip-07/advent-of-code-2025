package day03;
import java.util.Scanner;
import java.io.*;

public class Main {
    //--
    public static long TOTAL = 0;
    public static Bank[] banks = new Bank[200];
    //--
    public static void readFile(Scanner in){
        int i = 0;
        while(in.hasNextLine() && i < banks.length){
            String number = in.nextLine();
            banks[i] = new Bank(number);
            i++;
        }
    }
    //--
    public static void processFile(){
        BankIterator bi = new BankIterator(banks);
        while(bi.hasNext()){
            Bank bank = bi.next();
            System.out.println(bank.getVoltage());
            TOTAL += bank.getVoltage();
        }
    }
    //--
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("src/day03/input.txt"));
        readFile(in);
        processFile();
        System.out.println(TOTAL);
        in.close();
        //RESPOSTA PARTE 1 - 16973
        //RESPOSTA PARTE 2 -
    }
}
