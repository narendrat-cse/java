import java.util.*;
class StdX
{
	String name;
	int usn;
public void accept()
{
	Scanner sc=new Scanner(System.in);
	usn=sc.nextInt();
	name=sc.next();
}
public void display(){
    	System.out.println("usn:"+usn);
	System.out.println("name:"+name);
}
 }
public class Std{
	public static void main(String[] args){
	StdX s1=new StdX();
	StdX s2=new StdX();
	s1.accept();
	s1.display();
	s2.accept();
	s2.display();
	}
}
