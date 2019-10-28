package at.fhj.msd.swdesign.demo.srp;

public class SRP_Main {

    public static void main(String[] args) {

        User user = new User("Anton");

        UserService userService = new UserService();
        userService.changeUserData(user, "Anton1234", true);


        // status User
        System.out.println(user);

        UserAccessService.checkAccess(user);
        System.out.println(user);


        UserSettingService userSettingService = new UserSettingService();
        userSettingService.changeUserData(user, "Toni", true);
        System.out.println(user);




    }
}
