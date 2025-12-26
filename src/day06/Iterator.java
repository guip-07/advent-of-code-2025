package day06;

public class Iterator {
    public Problem[] problems;
    private int position = 0;
    public Iterator(Problem[] problems){
        this.problems = problems;
    }
    public boolean hasNext(){
        return position<problems.length;
    }
    public Problem next(){
        return  problems[position++];
    }
}
