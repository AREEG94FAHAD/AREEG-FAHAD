import java.util.EnumSet;
public class MAINCLASS {
    public static void main(String []args) {

        CHECK_EMAIL x = new CHECK_EMAIL();

        String email = null;
        String name = null;


        for (Email userinfo : Email.values()) {

            System.out.printf("%S \t %S\t \n", userinfo.getUserName(), userinfo.getEmailaddress());
    }


        for (Email userinfo :Email.values()) {

            email = userinfo.getEmailaddress();
            if (x.valid(email) == false)
                System.out.println("soory this are invalid email address "+email+" plesae check it ");

        }

    }
}
