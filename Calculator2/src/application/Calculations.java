package application;

public class Calculations {
	public static int calc(char op,int a,int b) {
		if(op=='+') {
			return (a+b);
		}
		else if(op=='-') {
			return (a-b);
		}
		else if(op=='/') {
			return (a/b);
		}
		else if(op=='*') {
			return (a*b);
		}
		else {
			return -1;
		}
	}
}
