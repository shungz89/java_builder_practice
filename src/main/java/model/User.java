package model;


import utils.BirthdayHelper;

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
            setAge(dateOfBirth);
            return this;
        }

        private void setAge(Date dateOfBirth) {
            this.age = new BirthdayHelper(dateOfBirth).getBirthDay();
        }

        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
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
}
