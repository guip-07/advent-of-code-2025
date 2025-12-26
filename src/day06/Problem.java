package day06;

public class Problem {
    //--
    public Long[] numbers = new Long[4];
    public char oper;
    //--
    public Problem(long n_1, long n_2, long n_3, long n_4, char oper){
        numbers[0] = n_1;
        numbers[1] = n_2;
        numbers[2] = n_3;
        numbers[3] = n_4;
        this.oper = oper;
    }
    //--
    public long getResult(){
        long result = 0;
        if(oper=='+'){
            for(int i = 0; i < 4; i++){
                result += numbers[i];
            }
        }
        if(oper=='*'){
            result = 1;
            for(int i = 0; i < 4; i++){
                result = result*numbers[i];
            }
        }
        return result;
    }
}
