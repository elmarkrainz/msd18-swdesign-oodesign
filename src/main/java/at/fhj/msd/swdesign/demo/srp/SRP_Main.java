package at.fhj.msd.swdesign.demo.srp;

public class SRP_Main {

    public static void main(String[] args) {

        User user = new User("Anton");

        UserService userService = new UserService();
        userService.changeUserData(user, "Anton1234", true);


        // status User
        System.out.println(user);


    }
}
