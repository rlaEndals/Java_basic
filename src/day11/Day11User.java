package day11;

public class Day11User {
    private String id;
    private String password;

    private String name;
    private String address;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        if (password.length()>=8) {
            this.password = password;
            return true;
        }
        else {
            System.out.println("8글자 이상");
            return false;
        }
    }
}
