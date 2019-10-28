package at.fhj.msd.swdesign.demo.srp;

public class User {

    private String name;
    private boolean hasAccess;

    public User(String name) {
        this.name = name;
        hasAccess = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public boolean hasAccess() {
        return hasAccess;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", hasAccess=" + hasAccess +
                '}';
    }
}
