package day12;

public class Day12ObjectArray {
    public static void main(String[] args) {
        Day12Student[] students = new Day12Student[5];

        students[0] = new Day12Student("진우", 14);
        students[1] = new Day12Student("뚱민", 14);
        students[2] = new Day12Student("승환", 26);
        students[3] = new Day12Student("똥휘", 14);
        students[4] = new Day12Student("째준", 14);

        for (int i = 0; i<5; i++){
            students[i].introduce();
        }
        for (Day12Student student : students) {
            student.introduce();
        }
    }
}
