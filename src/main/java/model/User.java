package model;


import org.json.JSONObject;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static utils.DateUtils.getBirthDay;

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

//    public String toJsonString() {
//
//    }
}