import java.util.*;

class Person {
    String number;
    String name;
    String gender;
    // 带参构造函数
    public Person (String n, String na){
        this.number = n;
        this.name = na;
    }
    public void getPerson (){
        System.out.println("StudentNumber = "+this.number);
        System.out.println("StudentName = "+this.name);
    }
    public void changePerson (String n, String na){
        this.number = n;
        this.name = na;
    }
}

// 没有用
class Teacher extends Person {
    String department;
    public Teacher (String de, String n, String na){
        super(n, na);
        this.department = de;
    }
    public void getTeacher (){
        System.out.println(this.department);
    }
    public void changePerson (String de){
        this.department = de;
    }
}

// 继承Person
class Student extends Person {
    String classNum;
    public Student(String cNum, String n, String na){
        // 调用父类带参构造函数
        super(n, na);
        this.classNum = cNum;
    }
    public void getStudent(){
        System.out.println("ClassNumber = "+this.classNum);
        // 先调用父类getPerson()方法
        super.getPerson();
        System.out.println();
    }
    public void changeStudent (String cNum){
        this.classNum = cNum;
    }
}

// 单独的类 不继承Person
class Classes {
    // 有班级名称 和 学生数组
    String className;
    Student[] classStudent = new Student[10];
    public Classes (String className){
        this.className = className;
    }
    public void setClasses(String className, Student[] classStudent){
        this.className = className;
        this.classStudent = classStudent;
    }
    // 打印classes类型变量
    public void printClasses(){
        System.out.println("ClassName = "+this.className);
        System.out.println();
        // 数组类型.length 为数组长度
        for (int i = 0; i < this.classStudent.length; i++){
            classStudent[i].getStudent();
        }
    }
}

public class exp3_5 {
    public static void main(String[] args) {
        Classes oneClass = new Classes("Class1");
        // 开辟数组空间 初始化需第 92 行语句
        Student[] oneClassStudent = new Student[10]; 
        for (int i = 0; i < 10; i++){
            int j = i + 1;
            String s = String.valueOf(j);
            String sb = new String("00");
            sb = sb + s;
            String sb2 = new String("Student");
            sb2 = sb2 + s;
            // new出单个数组元素 调用构造函数
            oneClassStudent[i] = new Student("Class1", sb, sb2);
        }
        // setClasses(String, Student[]) 第二个参数为数组类型，传入数组名
        oneClass.setClasses("Class1", oneClassStudent);
        oneClass.printClasses();
    }
}