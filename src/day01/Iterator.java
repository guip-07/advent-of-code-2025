package day01;
public class Iterator {
    private String[] moves;
    private int position = 0;
    //--
    public Iterator(String[] moves){
        this.moves = moves;
    }
    //--
    public boolean hasNext(){
        return position < moves.length;
    }
    //--
    public String next(){
        return moves[position++];
    }
}
