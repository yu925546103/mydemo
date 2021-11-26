package repository;

import domain.User;
import org.springframework.beans.factory.BeanFactory;

import java.util.Collection;

/**
 * @Author yujt
 * @Date 2021/11/14 09:50
 * @Version 1.0
 */
public class UserRepository {

    private Collection<User> users;

    private BeanFactory beanFactory;

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                ", beanFactory=" + beanFactory +
                '}';
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

}
