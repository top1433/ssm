import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {


    @Autowired
    Person person;

    public Person getPerson(){
        return person;
    }
}
