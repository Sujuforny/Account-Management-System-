import java.sql.SQLOutput;
import java.util.Scanner;

public class Students {
    private Integer id ,age;
    private String name,gender,className;
    private Float score;
    TryCatch tryCatch = new TryCatch();
    Scanner scanner = new Scanner(System.in);
    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setClassName(String className){
        this.className=className;
    }
    public void setAge(Integer age){
        this.id = age;
    }
    public void setScore(Float score){
        this.score = score;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getClassName(){
        return className;
    }
    public Integer getAge(){
        return age;
    }
    public Float getScore() {
        return score;
    }
    Students(Integer id, String name, String gender, String className, Integer age, Float score ){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.score = score;
    }
    Students(){}

    public void inputInformention(){

        id = tryCatch.tryCatchInputOnlyInteger("ID");
        name = tryCatch.tryCatchInputOnlyLetters("Name");
        gender = tryCatch.selectGender();
        className = tryCatch.tryCatchInputOnlyLetters("Class name");
        age = tryCatch.tryCatchInputOnlyInteger("Age");
        score = tryCatch.tryCatchInputOnlyFloat("Score");
    }
    public String outputInformention() {
        return "Students{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
