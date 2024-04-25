package prog2_01.enshu_2;

public class Day {
    private int year;
    private int month;
    private int day;
    
    Day(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }
    public String getOpeningDate(){
        return year+"年"+month+"月"+day+"日";
    }
    
}


