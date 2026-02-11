package ex07.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lm = new LotteMart();
        Customer1 cus1 = new Customer1();

        // 1. 마트 입고 준비
        new Thread(() -> {

            for (int i = 1; i < 11; i++) {
                System.out.println("입고중...("+i+ "초)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            lm.received();
            System.out.println("입고 완료!");
        }).start();

        // 2. 손님이 폴링
        new Thread(() -> {
            while (true){
                System.out.println("[손님] 상품 있어...?");
                cus1.request(lm);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
