package Report;

public class Day1 {
    private int year;
    private int month;
    private int day;
    
    Day1(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }
    public String getOpeningDate(){
        return year+"年"+month+"月"+day+"日";
    }
}


