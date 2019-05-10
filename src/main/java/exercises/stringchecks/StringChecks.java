package exercises.stringchecks;

public class StringChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		String s = "test";
		int i = 23;
		long l = 839829839l;
		float f = 289.4f;
		double d = 8923982.93;
		
		Employee e1 = new Employee();
		e1.empNo = 289289;
		e1.name = "dslkj";
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(e1);
		
		print("");
		print("");
		
		print(c);
		print(s);
		print(i);
		print(l);
		print(f);
		print(d);
		print(e1);
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
