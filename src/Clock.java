public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(hoursAtBeginning, 23);
        minutes = new BoundedCounter(minutesAtBeginning, 59);
        seconds = new BoundedCounter(secondsAtBeginning, 59);
    }
    
    public void tick() {
        // Clock advances by one second
        seconds.next();
        if(seconds.getValue() == 0) {
            minutes.next();
            if(minutes.getValue() == 0) {
                hours.next();
            }
        }
    }
    
    public String toString() {
        // returns the string representation
        return "" + hours + ":" + minutes + ":" + seconds;
    }
}
