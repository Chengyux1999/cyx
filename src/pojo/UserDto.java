package pojo;

public class UserDto {
    private int u_age;
    private String u_name;

    public int getU_age() {
        return u_age;
    }

    public void setU_age(int u_age) {
        this.u_age = u_age;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public UserDto(int u_age, String u_name) {
        this.u_age = u_age;
        this.u_name = u_name;
    }

    public UserDto() {
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "u_age=" + u_age +
                ", u_name='" + u_name + '\'' +
                '}';
    }
}
