class Maths3{
	public static void main(String xyz[]){
	
	
	int numbers[]={15,36,42,91,48};
	int i;
	int maxValue =0;
		for(i=1;i<numbers.length;i++)
			if(numbers[i]>maxValue){
			    maxValue=numbers[i];
			}
		
			System.out.println(maxValue);
	}
}
