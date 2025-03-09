package day15;

public class Day15Pracice {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("구진우");
        CodingTeacher codingTeacher = new CodingTeacher("천승환");
        BaboTeacher baboTeacher = new BaboTeacher("김뚱민");

        mathTeacher.teachSubject();
        codingTeacher.teachSubject();
        baboTeacher.teachSubject();
    }
}
