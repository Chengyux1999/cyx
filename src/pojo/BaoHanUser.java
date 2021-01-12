package pojo;

public class BaoHanUser {
   private User user;

    public BaoHanUser() {
    }

    public BaoHanUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BaoHanUser{" +
                "user=" + user +
                '}';
    }
}
