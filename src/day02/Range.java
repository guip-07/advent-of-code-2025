package day02;

public class Range {
    private long start;
    private long end;
    private long invalidID = 0;
    public Range(String startSTR, String endSTR){
        start = Long.parseLong(startSTR.trim());
        end = Long.parseLong(endSTR.trim());
    }
    //--
    public long getStart(){
        return start;
    }
    //--
    public void processRange(){
        for(long i = start; i <= end; i++){
            if(isRepetitive(i)){ invalidID+=i; }
        }
    }
    //--
    private boolean isRepetitive(long number){
        String s = String.valueOf(number);
        int len = s.length();
        //--
        if (len % 2 != 0) return false;
        int mid = len / 2;
        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);
        return firstHalf.equals(secondHalf);
    }
    //--
    public long getInvalidID(){
        return invalidID;
    }
}
