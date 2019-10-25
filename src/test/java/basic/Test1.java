package basic;

class Course1
{
	private String cname;
	private int ccost;
	
	public Course1(String cname, int ccost) {
		super();
		this.cname = cname;
		this.ccost = ccost;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCcost() {
		return ccost;
	}
	public void setCcost(int ccost) {
		this.ccost = ccost;
	}
			
}


class Student1 {
	
	private String sname;
	private Course1[] courses;
	
	
	
	public Student1(String sname, Course1[] courses) {
		super();
		this.sname = sname;
		this.courses = courses;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSname() {
		return sname;
	}
	
	
	
	public Course1[] getCourses() {
		return courses;
	}
	public void setCourses(Course1[] courses) {
		this.courses = courses;
	}
	
	public void display()
	{
		System.out.println(sname);
		
		for(Course1 course:courses)
		{
			System.out.println(course.getCcost());
			System.out.println(course.getCname());
		}
	}
}



public class Test1 {

	public static void main(String[] args) {
	
		Course1 c1=new Course1(".Net",5000);
		Course1 c2=new Course1("c#",22000);
	
		Course1[] c= {c1,c2};
		
		Student1 s1=new Student1 ("SUdeep",c);
		
		s1.display();
	}

}
