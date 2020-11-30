package day20ClassWork.homework.object;

import java.util.Objects;

public class User {

    public int id;
    public String username;
    public String realname;
    public String password;
    public String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(realname, user.realname) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, realname, password, email);
    }
}
