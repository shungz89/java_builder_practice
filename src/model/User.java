package model;

import java.util.Calendar;
import java.util.Date;

public class User {
    String name;
    Date dateOfBirth;
    String gender;
    int age;

    public static class UserBuilder {


        private String name = "";
        private Date dateOfBirth = new Date();
        private String gender = "";
        private int age = 0;


        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            setAge();
            return this;
        }

        public void setAge() {
            this.age = getBirthDay(this.dateOfBirth);
        }

        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        private int getBirthDay(Date dateOfBirth) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateOfBirth);

            Calendar calNow = Calendar.getInstance();

            long calDiff = calNow.getTimeInMillis() - cal.getTimeInMillis();

            long difference_In_Years
                    = (calDiff
                    / (1000l * 60 * 60 * 24 * 365));

            return (int) difference_In_Years;

        }

        public User build() {
            return new User(this);
        }

    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    private User(UserBuilder userBuilder) {
        name = userBuilder.name;
        dateOfBirth = userBuilder.dateOfBirth;
        gender = userBuilder.gender;
        age = userBuilder.age;
    }

    // toString
    @Override
    public String toString() {
        return "User : {name="
                + name
                + ", dateOfBirth="
                + dateOfBirth
                + ", gender="
                + gender
                + ", age="
                + age +
                "}";
    }
}
