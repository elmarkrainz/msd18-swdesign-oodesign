package at.fhj.msd.swdesign.demo.srp;

public class UserAccessService {

    static public boolean checkAccess(User user) {
        // check other stuff e.g. role
        return user.hasAccess();
    }
}