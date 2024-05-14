// 演習問題3: 日付クラスの改良 Day.java
import java.time.LocalDate;
public class Day {
	private int year  = 1;		// 年
	private int month = 1;		// 月
	private int date  = 1;		// 日
    
	//--- y年は閏年か？ ---//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	//--- 閏年か？ ---//
	public boolean isLeap() { return isLeap(year); }

	//-- コンストラクタ --//
	public Day(){ LocalDate a = LocalDate.now();
                year =a.getYear();
				month =a.getMonthValue();
				date = a.getDayOfMonth();
	}
	public Day(int year){
		if(year<0){
			year=0;
		}
		this.year = year; 
	}
	public Day(int year, int month){
		if(year<0){
			year=0;
		}
		if(month<1){
			month=1;
		}
		if(month>12){
			month=12;
		}
		this.year = year; 
		this.month = month; 
	}
	public Day(int year, int month, int date) {
		if(year<0){
			year=0;
		}
		if(month<1){
			month=1;
		}
		if(month>12){
			month=12;
		}
		if(month==2||month==4||month==6||month==9||month==11){
			if(isLeap(year)){
				if(month==2){
					if(date>29){
						date=29;
					}
					if(date<1){
						date=1;
					}
				}else{
					if(date>30){
						date=30;
					}
					if(date<1){
						date=1;
					}
				}
			}else{
				if(date>30){
					date=30;
				}
				if(date<1){
					date=1;
				}
			}
		}else{
			if(date>31){
				date=31;
			}
			if(date<1){
				date=1;
			}
		}
		this.year = year; 
		this.month = month; 
		this.date = date; 
	}
	public Day(Day d){ 
		if(d.year<0){
			d.year=0;
		}
		if(d.month<1){
			d.month=1;
		}
		if(d.month>12){
			d.month=12;
		}
		if(d.month==2||d.month==4||d.month==6||d.month==9||d.month==11){
			if(isLeap(d.year)){
				if(d.month==2){
					if(d.date>29){
						d.date=29;
					}
					if(d.date<1){
						d.date=1;
					}
				}else{
					if(d.date>30){
						d.date=30;
					}
					if(d.date<1){
						d.date=1;
					}
				}
			}else{
				if(d.date>30){
					d.date=30;
				}
				if(d.date<1){
					d.date=1;
				}
			}
		}else{
			if(d.date>31){
				d.date=31;
			}
			if(d.date<1){
				d.date=1;
			}
		}
		this.year = d.year; 
		this.month = d.month; 
		this.date = d.date; 
	}
	//クラスメソッド(前の日付が後ろの日付と比べて前であるか)
	public static boolean before(Day d,Day a){
		return d.year<a.year||d.year==a.year&&d.month<a.month||d.year==a.year&&d.month==a.month&&d.date<a.date;
	}
		//インスタンスメソッド(他の日付と比べて前の日付であるか)
	public boolean before(Day d){
		return year<d.year||year==d.year&&month<d.month||year==d.year&&month==d.month&&date<d.date;
	}

	//--- 年・月・日を取得 ---//
	public int getYear()  { return year; }		// 年を取得
	public int getMonth() { return month; }	// 月を取得
	public int getDay()   { return date; }		// 日を取得

	//--- 年・月・日を設定 ---//
	public void setYear(int year)   { this.year  = year; }	// 年を設定
	public void setMonth(int month) { this.month = month; }	// 月を設定
	public void setDate(int date)   { this.date  = date; }	// 日を設定

	public void set(int year, int month, int date) {			// 年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}


	//--- 曜日を求める ---//
	public int dayOfWeek() {
		int y = year;					// 0 … 日曜日
		int m = month;					// 1 … 月曜日
		if (m == 1 || m == 2) {		//　 ：
			y--;							// 5 … 金曜日
			m += 12;						// 6 … 土曜日
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 日付dと等しいか ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
}
