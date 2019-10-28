package at.fhj.msd.swdesign.demo.srp;


/**
 * BAD EXAMPLE
 *
 * UserService has two different
 */

public class UserService {

    public void changeUserData(User user, String name, boolean access){

        if (checkAccess(user)){
            user.setHasAccess(access);
            user.setName(name);
            // persist Data
        }
    }


    public boolean checkAccess(User user){

        return user.hasAccess();
    }
}
