package day12;

public class Day12Book {
    private String title;
    private  String writer;
    private boolean isRented;

    public Day12Book(String title, String writer, boolean isRented) {
        this.title = title;
        this.writer = writer;
        this.isRented = isRented;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentBook() {

        if (isRented == true) {
            System.out.println(title + "이(가) 이미 대여중입니다");
        } else {
            isRented = true;
            System.out.println(title + "은(는) 대여되었습니다.");
        }
    }
}
