class Results3{

   public static void main (String xyz[]){  
   school james= new school();
   //james.phy(70);
    james.chemistry(50);
	james.maths(10);
	james.physics(50);
	james.total();
	james.pass();
	 // james.showResults();
	 
	

   }
}

  class school{
    int phy,che,mat;
	float total;
      
	  public void physics(int a){
        if(a>=0 & a<=150){
	      phy=a;
		  System.out.println(phy);
		  
	    }
	      else {
	         System.out.println("Invalid");
	       }
	  }
	  
	  
		 public void chemistry(int a){
        if(a>=0 & a<=150){
	      che=a;
		  System.out.println(che);
		  
		  
	    }
	      else {
	         System.out.println("Invalid");
	       }
		   
		 }
		 
		 
		   public void maths(int a){
        if(a>=0 & a<=150){
	      mat=a;
		  System.out.println(mat);
		  
	    }
	      else {
	         System.out.println("Invalid");
	       }
        
	}

       public void total(){
		   total = phy+che+mat;
		   System.out.println(total);
		   
	   }
	   
	   public void pass(){
		   
		    if (phy >= 60) {
			
                System.out.println("Physics passed");
                   if(phy<60){
                    System.out.println("No");
                    }
			}
				   
				if (che >= 60) {
                   System.out.println("Chemsitry passed");
                     if(che<60){
                       System.out.println("Uh oh");
                     }
                 }
			
				    if (mat >= 60) {
                     System.out.println("Maths passed");
                       if(mat<60){
                         System.out.println("Uh oh");
                        }
                    }
		   
		   
	   }
	   


	
   }
  
  

   
 