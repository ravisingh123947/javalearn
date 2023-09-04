import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoInvocationClass {
    public static void main(String[] args) {
        MongoClass mongoClass = new MongoClass();
        mongoClass.test();
    }
}
