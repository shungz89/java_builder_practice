package utils;

import java.util.Date;

public class BirthdayHelper {
    private long dateToday;
    private long dateOfBirthLong;
    public BirthdayHelper(Date dateOfBirth) {
         this.dateToday = new Date().getTime();
         this.dateOfBirthLong = dateOfBirth.getTime();
    }

    public int getBirthDay() {
        long difference_In_Years
                = dateDifference()
                / (1000l * 60 * 60 * 24 * 365);

        return (int) difference_In_Years;
    }

    private long dateDifference(){
        return dateToday - dateOfBirthLong;
    }
}
