package day02;
public class Iterator {
    private Range[] ranges;
    private int position = 0;
    //--
    public Iterator(Range[] ranges){
        this.ranges = ranges;
    }
    //--
    public boolean hasNext(){
        return position < ranges.length;
    }
    //--
    public Range next(){
        return ranges[position++];
    }
}
