package domain;

import annotation.Super;

/**
 * @Author yujt
 * @Date 2021/11/13 12:00
 * @Version 1.0
 */
@Super
public class SuperUser extends User{

    private String superId;

    private String superName;

    @Override
    public String toString() {
        return "SuperUser{" +
                "superId='" + superId + '\'' +
                ", superName='" + superName + '\'' +
                '}';
    }

    public String getSuperId() {
        return superId;
    }

    public void setSuperId(String superId) {
        this.superId = superId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }
}
