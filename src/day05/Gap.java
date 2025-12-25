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
    public long getStart() {
        return start;
    }
    //--
    public long getEnd() {
        return end;
    }
    //--
    public long getRange(){
        return (end-start+1);
    }
}
