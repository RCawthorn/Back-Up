class Results{
	
	 public static void main(String x[]){
		Results2 Peter,Smith;
		Peter = new Results2();
		Smith = new Results2();
		Peter.phy = 100;
		Peter.che = 50;
		Peter.met = 100;
		Peter.doCalculations();
		Peter.showReslts();

		//peter.name= "Peter";
		
		
	 }
}
		
		class Results2{
			
		
         int phy,che,met;
		 
		 private float total,per;
		 private void doCalculations(){
			 total = phy+che+met;
			 per = total *100/450;
		 }
          public void showReslts(){
		  
			  doCalculations();
           int Total=phy+che+met;
            System.out.println("Results are: " + total);
			System.out.println("Percentage: " + per);
       

	}
  }

