package at.fhj.msd.swdesign.demo.srp;

public class UserSettingService {

    public void changeUserData(User user, String name, boolean access) {

        user.setHasAccess(access);
        user.setName(name);
        // persist Data
    }
}