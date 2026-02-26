import java.beans.JavaBean;

public class Test {
    public Test ( String name, int age){
        this.name=name;
        this.age=age;
    }
    public class Javabasics {
        public static void main(String[] args) {
            Test s=new Test("Ram",10) ;
            System.out.println(s.student());    
            
        }
    }

}
 