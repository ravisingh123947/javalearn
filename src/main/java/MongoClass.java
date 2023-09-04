import com.springbootdemo.stream.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoClass {


    @Autowired
    MongoTemplate mongoTemplate;

    public void test() {
        Student student  = new Student();
        student.setId(1);
        student.setName("raviranjan");
        mongoTemplate.save(student);
    }
}
