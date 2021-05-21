import model.ComplexNumber;
import model.Product;
import model.User;
import utils.JSONUtils;

import java.util.Calendar;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello CS \n");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthDate = cal.getTime();

        User user = new User.UserBuilder()
                .setName("Javaman")
                .setDateOfBirth(birthDate)
                .setGender("M")
                .build();

        System.out.println("UserName: " + user.getName());
        System.out.println("DOB: " + user.getGender());
        System.out.println("Age: " + user.getAge());
        System.out.println("Gender " + user.getDateOfBirth());

//        System.out.println("User JSON "+user.toJsonString());

        Product product = new Product.ProductBuilder().setName("Coca-Cola").setId(1578).build();

        try {
            System.out.println(JSONUtils.getFieldNamesAndValues(user, false));
            System.out.println(JSONUtils.getFieldNamesAndValues(product, false));

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    //Item 17 Effective Java: Minimize Mutability Example
    private void tryingOutMinimizeMutability(){
        ComplexNumber complexNumber = new ComplexNumber(5, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(7, 2);

        complexNumber.plus(complexNumber2);
    }
}
