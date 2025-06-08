package project;

public class User {
    private String name;
    private String birthday;
    private String bloodType;

    public User() {
    }

    public User(String name, String birthday, String bloodType) {
        this.name = name;
        this.birthday = birthday;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getAge() {

        String[] parts = birthday.split("\\.");
        int year = Integer.parseInt(parts[0]);

        return 2025-year+1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
