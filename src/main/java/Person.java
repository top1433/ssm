import org.springframework.beans.factory.annotation.Value;

public class Person {
    String name="lisi";

    @Value("${name}")
    String testname;


    @Value("${password}")
    String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", testname='" + testname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
