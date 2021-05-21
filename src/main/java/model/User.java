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
        return this.name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.dateOfBirth = userBuilder.dateOfBirth;
        this.gender = userBuilder.gender;
        this.age = userBuilder.age;
    }
}
