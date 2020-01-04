package jan4;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo_ArryList {
public static void main(String[] args) {
		ArrayList<String>str=new ArrayList<String>();
		str.add("Mon");
		str.add("Tue");
		str.add("wed");
		str.add("Thu");
		str.add("Fri");
		str.add("Sat");
		str.add("Sun");
		System.out.println(str.get(3));
		Iterator<String>x=str.iterator();
		while (x.hasNext())
		{
			System.out.println(x.next());
		}
	}

}
