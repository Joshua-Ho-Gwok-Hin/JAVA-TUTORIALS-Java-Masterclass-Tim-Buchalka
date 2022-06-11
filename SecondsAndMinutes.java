public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(38L,50L));
        System.out.println(getDurationString(3680L));
    }

    public static String getDurationString(long minutes, long seconds){
        if ((minutes < 0) || (seconds < 0) || (59 < seconds)){
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10){
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minuteString = "0" + minuteString;
        }

        String secondString = seconds + "s";
        if (seconds < 10){
            secondString = "0" + secondString;
        }

        return minutes + "mins " + seconds + "sec = " + hourString + " " + minuteString + " " + secondString;
    }

    public static String getDurationString(long seconds){
        if ((seconds < 0)){
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
