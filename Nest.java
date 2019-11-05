
public class Nest {

    public static void main(String[] args) {

        int a,b;
		 a=b=1;
		  while(a<=10){
		   b=1;
		    while(b<=a){
			 System.out.print(b);
			  
			  if (b<a){
				  System.out.print(",");
			  }
			  b++;
			}
		 System.out.println(".");
		  a++;
		  }
		   
    }
}
