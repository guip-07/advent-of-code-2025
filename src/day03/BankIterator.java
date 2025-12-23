package day03;
public class BankIterator {
    private Bank[] banks;
    private int position = 0;
    //--
    public BankIterator(Bank[] banks){
        this.banks = banks;
    }
    //--
    public boolean hasNext(){
        return position < banks.length;
    }
    //--
    public Bank next(){
        return banks[position++];
    }
}
