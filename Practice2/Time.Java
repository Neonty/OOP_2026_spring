public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(int hourValue, int minuteValue, int secondValue)
    {
        if (hourValue < 0 || hourValue > 23)
        {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }

        if (minuteValue < 0 || minuteValue > 59)
        {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }

        if (secondValue < 0 || secondValue > 59)
        {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }

        this.hour = hourValue;
        this.minute = minuteValue;
        this.second = secondValue;
    }

    public String toUniversal()
    {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String toStandard()
    {
        int standardHour = hour % 12;
        
        if (standardHour == 0)
        {
            standardHour = 12;
        }

        String period = (hour < 12) ? "AM" : "PM";

        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time other) {
        this.second += other.second;
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }

        this.minute += other.minute;
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }

        this.hour += other.hour;
        this.hour = this.hour % 24;
    }
}