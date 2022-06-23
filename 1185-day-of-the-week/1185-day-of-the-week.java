
import java.time.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        String dayOfWeek = LocalDateTime.of(year, month, day, 10, 10).getDayOfWeek().toString();
        
        return dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();
    }
}