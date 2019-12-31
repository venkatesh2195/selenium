package dec26;

import org.apache.xpath.operations.Equals;

public class String_Matches {
public static void main(String[] args) {
String str1="Hello";
String str2="hello";
String str3="Hello";
String str4="HELLO";
System.out.println(str1.equals(str2));//false
System.out.println(str1.equals(str3));
System.out.println(str2.equals(str4));
System.out.println(str1.equals(str4));
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str1.equalsIgnoreCase(str3));
	}

}
