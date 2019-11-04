package at.fhj.msd.swdesign.demo.isp;


/**
 * BAD EXample User implements overloaded Interface
 */


public class User implements IUserOps {

    //--- basic User stuff
    private String name;
    private boolean hasAccess;

    public User(String name) {
        this.name = name;
        hasAccess = false;
    }




    // 3 different operations from one interface

    public void saveUserData() {
        System.out.println("save data");
    }


    public boolean checkUserAccess() {
        System.out.println("check access");
        return false;
    }


    public void anotherUserOperation() {


    }
}
