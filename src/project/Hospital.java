package project;

public class Hospital {
    private String name;
    private String location;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public int calculatePrice(int age, String department) {
        int t = 0;

        if (age<=19 || age >=70){
            t = 2000;
        } else {
            t = 5000;
        }
        if (location.equals("서울")) {
            t += 1500;
        }
        if (department.equals("정형외과")) {
            t += 15000;
        } else if (department.equals("피부과")) {
            t += 12000;
        } else if (department.equals("내과")) {
            t += 4500;
        }
        return t;
    }
}
