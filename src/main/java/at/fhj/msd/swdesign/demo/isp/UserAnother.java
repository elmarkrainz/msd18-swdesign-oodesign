package at.fhj.msd.swdesign.demo.isp;

public class UserAnother implements IUserAnother, IUserAccess{

    // some user stuff

    public void anotherUserOperation() {
        System.out.println("this is another user op");
    }

    public boolean checkUserAccess() {
        return false;
    }
}
