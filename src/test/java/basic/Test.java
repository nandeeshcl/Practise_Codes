package basic;

class Course
{
	private String cname;
	private int ccost;
	
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


class Student {
	
	private String sname;
	private Course[] courses;
	public String getSname() {
		return sname;
	}
	
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	public void display()
	{
		System.out.println(sname);
		
		for(Course course:courses)
		{
			System.out.println(course.getCcost());
			System.out.println(course.getCname());
		}
	}
}
public class Test {

	public static void main(String[] args) {
		
		Course c1=new Course();
		c1.setCcost(2000);
		c1.setCname(".NET");
		
		Course c2=new Course();
		c2.setCcost(1000);
		c2.setCname("C#");
		
		//Added to course array
		Course[] course= {c1,c2};
		
		
		Student s1=new Student ();
		s1.setSname("Sudeep");
		s1.setCourses(course);
		
		
		s1.display();

	}

}
