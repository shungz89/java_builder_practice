package model;

public class User {
    String name;
    String dateOfBirth;
    String gender;

    public static class Builder {


        private String name = "";
        private String dateOfBirth = "";
        private String gender = "";

        public Builder builder(){
            return this;
        }


        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    private User(Builder builder){
        name = builder.name;
        dateOfBirth = builder.dateOfBirth;
        gender = builder.gender;
    }

    // toString
    @Override
    public String toString()
    {
        return "User : {name="
                + name
                + ", dateOfBirth="
                + dateOfBirth
                + ", gender="
                + gender + "}";
    }
}
