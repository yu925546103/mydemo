package domain;

/**
 * @Author yujt
 * @Date 2021/11/21 22:27
 * @Version 1.0
 */
public class UserHolder {

    private SuperUser superUser;

    public User getSuperUser() {
        return superUser;
    }

    public void setSuperUser(SuperUser superUser) {
        this.superUser = superUser;
    }

    public UserHolder() {

    }

    public UserHolder(SuperUser superUser) {
        this.superUser = superUser;
    }

    @Override
    public String toString() {
        return "UserHolder{" +
                "user=" + superUser +
                '}';
    }
}
