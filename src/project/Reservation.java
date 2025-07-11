package project;

public class Reservation {
    private User user;
    private String department;
    private String disease;
    private int price;
    private boolean isPayed;

    public Reservation() {
    }

    public Reservation(User user, String department, String disease, int price, boolean isPayed) {
        this.user = user;
        this.department = department;
        this.disease = disease;
        this.price = price;
        this.isPayed = isPayed;
    }

    public User getUser() {
        return user;
    }

    public String getDepartment() {
        return department;
    }

    public String getDisease() {
        return disease;

    }

    public int getPrice() {
        return price;
    }

    public boolean isPayed() {
        return isPayed;

    }
    public String getIsPayedString() {
        return isPayed ? "완료" : "미완";
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }
}
