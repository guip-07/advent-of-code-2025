package day05;

public class Gap {
    private long start;
    private long end;
    //--
    public Gap(String range){
        String[] split = range.split("-");
        start = Long.parseLong(split[0]);
        end = Long.parseLong(split[1]);
    }
    //--
    public boolean checkGAP(long number){
        if((number >= start)&&(number <= end)) return true;
        return false;
    }
}
