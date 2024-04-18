"public class dayofweek 
   int dayOfWeek() {
    int y = year; // 0 ・・・ 日曜日
    int m = month; // 1 ・・・ 月曜日
    if( m == 1 || m == 2) { // :
    y--; // 5 ・・・ 金曜日
    m += 12; // 6 ・・・ 土曜日
    }
    return (y + y / 4 – y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    
}}