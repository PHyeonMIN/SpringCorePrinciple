package hello.core.singleton;

// new SingletonService 불가능 -> private SingletonService() 때문에
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    // instance의 참조를 꺼낼 수 있는 방법은 이 메서드가 유일하다
    public static SingletonService getInstance() {
        return instance;
    }

    private  SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
