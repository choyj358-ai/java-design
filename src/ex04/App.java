package ex04;

// DIP : 추상적인 것에 의존하라
// OCP : 새로운 코드에는 OPEN, 기존 코드에는 CLOSE
public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Mouse mouse = new Mouse();
        Doorman doorman = Doorman.instance; // 싱글톤
        Doorman doorman2 = Doorman.instance; // 싱글톤
        System.out.println(doorman.hashCode());
        System.out.println(doorman2.hashCode()); // Doorman.instance 동일한 걸 확인할 수 있음.
        doorman.쫓아내(mouse);
        doorman.쫓아내(tiger);
    }
}
