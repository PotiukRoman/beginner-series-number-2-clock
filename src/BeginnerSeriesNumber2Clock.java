class Clock
{
    public static int Past(int h, int m, int s)
    {
        int milisecond;
        int second_in_hour;
        int second_in_minutes;
        int all_second;

        if((h>=0 & h<=23)&(m>=0 & m<=59)&(s>=0 & s<=59)){
            second_in_hour=h*3600;
            second_in_minutes=m*60;
            all_second=second_in_hour+second_in_minutes+s;
            milisecond=1000*all_second;
            return milisecond;
        }
        else{
            System.out.println("Error: Input constraints 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59");
            return 0;
        }
    }
}

public class BeginnerSeriesNumber2Clock {
    public static void main(String[] args) {
        // Testing
        System.out.println("Time since midnight "+Clock.Past(23,59,59)+" mls");

    }

}
