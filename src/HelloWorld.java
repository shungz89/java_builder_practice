import model.User;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello CS \n");
        User user = new User.Builder()
                .setName("Javaman")
                .setDateOfBirth("18-5-2021")
                .setGender("M")
                .build();

        System.out.println("UserName: "+user.getName());
        System.out.println("DOB: "+user.getGender());
        System.out.println("Gender "+user.getDateOfBirth());

        System.out.println("User JSON "+user);


    }
}
