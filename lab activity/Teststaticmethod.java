class Student
{  
int rollno;  
String name;  
static String college = "RAMANUJAR";  
static void change()
{  
college = "VIT";  
}  
Student(int r, String n)
{  
rollno = r;  
name = n;  
}  
void display(){System.out.println(rollno+" "+name+" "+college);
}  
}  
class Teststaticmethod
{  
public static void main(String args[])
{  
Student.change();
Student s1 = new Student(101,"Alok");  
Student s2 = new Student(102,"kappela");  
Student s3 = new Student(103,"mukesh");  
s1.display();  
s2.display();  
s3.display();  
}  
}