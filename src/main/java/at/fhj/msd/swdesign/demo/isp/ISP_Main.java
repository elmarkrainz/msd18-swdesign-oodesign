package at.fhj.msd.swdesign.demo.isp;

public class ISP_Main {

    public static void main(String[] args) {

        IUserOps userops;

        userops = new User("Andi");
        userops.checkUserAccess();
        userops.saveUserData();
        userops.anotherUserOperation();



        // ISP


    }
}
