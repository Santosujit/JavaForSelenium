package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		// post increment

		int a = 1;
		int b = a++;// ++ is special operator which will increase the value by 1.
					// 1st give the original value of a to b, then increment
					// post increment --- increase the value later
					// execution is always left to right, and top to bottom
		System.out.println(a);// 2
		System.out.println(b);// 1

		int c = -99;
		int d = c++;
		System.out.println(c);// -98
		System.out.println(d);// -99

		int g = -1000;
		int h = g++;
		System.out.println(g);// -999
		System.out.println(h);// -1000

		// pre-increment
		// increase the value first
		// below:- 1st increase the value of m by 1, then give this increased value of m
		// to n

		int m = 1;
		int n = ++m;
		System.out.println(m);// 2
		System.out.println(n);// 2

		int u = -99;
		int o = ++u;
		System.out.println(u);// -98
		System.out.println(o);// -98

		// post Decrement

		int x = 2;
		int y = x--;
		System.out.println(x);// 1
		System.out.println(y);// 2

		// pre decrement

		int q = 3;
		int f = --q;
		System.out.println(q);// 2
		System.out.println(f);// 2

		int total = 100;
		System.out.println(total++);// 100, 1st give the original value of total to println, then increase the valye
									// by 1
		System.out.println(total);// 101

		int bal = 999;
		System.out.println(++bal);// 1000

		double d1 = 99.99;
		System.out.println(++d1);// 100.99

		char c1 = 'a';// 97
		System.out.println(++c1);// b not 98

		boolean b1 = true;
		// System.out.println(++b1); as boolean is not an integer or floating
		// not applicable for boolean or Strings
		System.out.println(b1);

	}

}
