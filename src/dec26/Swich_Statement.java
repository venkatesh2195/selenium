package dec26;
public class Swich_Statement {
public static void main(String[] args) {
		String course="python";
		switch (course.toUpperCase())
		{
		case "JAVA":
			System.out.println("course is available");
			break;
		case "PYTHON":
			System.out.println("course is available");
			break;
		case "HADOOP":
			System.out.println("course is available");
			break; 
		default:
			System.out.println("course is not available");
			break;
		}

	}
}
