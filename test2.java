public class Test01 {

	public static void main(String[] args) {
		float num=6.65184558f;
		double dnum=7.51515151;
		char ch01='a';
		boolean flag=true;
		int r;
		final double Pi=3.1415926;
Scanner input=new Scanner(System.in);
System.out.println("请输入半径:");
		r=input.nextInt();
		double c=2*r*Pi;
		double s=Pi*r*r;
		System.out.println("周长:"+c);
		System.out.println("面积:"+s);
		double db=input.nextDouble();
		System.out.println(db);
		String name=input.next();
		System.out.println(name);
		char ch01=input.next().charAt(0);
		System.out.println(ch01);

	}
