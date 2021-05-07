package ASSIGNMENTPGMS;

public class findlengthofstringwithoutlengthmethod {
	public static void main(String[] args) {
		
	


String s="sample";
int count=0;
for(char c: s.toCharArray()) {
	count++;
}
System.out.println("length of given string is"+" "+count);
}
}