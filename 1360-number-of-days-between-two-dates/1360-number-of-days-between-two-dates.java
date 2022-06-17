import static java.time.LocalDate.parse;
import static java.time.temporal.ChronoUnit.DAYS;

// bhoot hi bekar ques hain ye bhai 
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        
        return (int) Math.abs(DAYS.between(parse(date1), parse(date2)));
        
    }
}