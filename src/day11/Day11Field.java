package day11;

public class Day11Field {

    public String a = "DDKSSUD";
    public String publicField = "누구나 접근 가능";

    private String privateField = "구진우";

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String value) {
        privateField = value;
    }
}
