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
        int indexStart = 0;
        int total = 12;

        for(int i = 0; i < total; i++) {
            int max = -1;
            int maxIndexFound = -1;
            int limit = numbers.length - (total - i);
            for(int j = indexStart; j <= limit; j++){
                if(numbers[j] > max){
                    max = numbers[j];
                    maxIndexFound = j;
                    if (max == 9) break;
                }
            }
            voltage = (voltage * 10) + max;
            indexStart = maxIndexFound + 1;
        }
        return voltage;
    }
}
