package day03;

public class Bank {
    //--
    public String bankNumber;
    public int[] numbers;
    //--
    public Bank(String number){
        bankNumber = number;
        numbers = new int[bankNumber.length()];
        for(int i = 0; i < bankNumber.length(); i++){
            numbers[i] = bankNumber.charAt(i) - '0';
        }
    }
    //--
    public String getBankNumber(){
        return bankNumber;
    }
    //--
    public long getVoltage(){
        long voltage = 0;
        int maxIndex = 0;
        int max = 0;
        int max_2 = 0;
        for(int i = 0; i < 99; i++){
            if(numbers[i]>max){
                max = numbers[i];
                maxIndex = i;
            }
        }
        for(int i = maxIndex+1; i < 100; i++){
            if(numbers[i]>max_2){
                max_2 = numbers[i];
            }
        }
        voltage = max*10L + max_2;
        return voltage;
    }
}
