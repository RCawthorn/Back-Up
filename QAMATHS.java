class QAMATHS{
	public static void main(String xyz[]){

int no1=4, no2=6;
float Result = 0;
String sign;

		try{
			no1=Integer.parseInt(xyz[0]);
			no2 = Integer.parseInt(xyz[2]);
			sign=xyz[1];
					if(sign.equals("/")){
					Result= no1/no2;
					}
			System.out.println(Result);
			}
catch(ArrayIndexOutOfBoundsException x){
	System.out.println("Please send 3 values");
}
catch(ArithmeticException e){
	System.out.println("Help");
		}
	}
}