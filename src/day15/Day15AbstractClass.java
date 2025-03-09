package day15;

public class Day15AbstractClass {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("구진우");
        Developer developer = new Developer("천승환");
        Babo babo = new Babo("김뚱민");
        Chef chef = new Chef("진똥휘");
         Artist artist = new Artist("박째준");

        doctor.performDuties();
        developer.performDuties();
        babo.performDuties();
        chef.performDuties();
        artist.performDuties();
    }
}
