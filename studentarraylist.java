package pack1;

import java.util.ArrayList;

public class Studentarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al5=new ArrayList<Student>();
		al5.add(new Student(1,"ram",5));
		al5.add(new Student(2,"shyam",5));
		al5.add(new Student(3,"tom",6));	
		System.out.println(al5);
		al5.remove(2);
		System.out.println(al5);
	}
}
