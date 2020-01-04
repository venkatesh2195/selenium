package jan4;
import java.util.ArrayList;
import java.util.Iterator;
public class Demo1_ArrayList {
public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(200);
		num.add(400);
		num.add(600);
		num.add(800);
		num.add(1000);
		num.add(10000);
		num.add(100000);
		Iterator<Integer>x=num.iterator();
		while (x.hasNext())
		{
			System.out.println(x.next());
		}
	}

}
