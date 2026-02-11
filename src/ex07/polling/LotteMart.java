package ex07.polling;

public class LotteMart {
    private String value = null;

    public String getValue() {
        return value;
    }

    // 입고
    public void received(){
        value = "상품";
    }
}
