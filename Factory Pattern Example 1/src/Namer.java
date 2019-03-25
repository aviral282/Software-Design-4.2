
	   abstract class Namer {
			protected String last;   //store last name here
			protected String first;  //store first name here
			protected String designations;
			
			public String getDesignation() {
				return designations; //return last name
		}
			
			public String getFirst() {
					return first; //return first name
			}
			public String getLast() {
					return last; //return last name
			}
			abstract String readFullName();
         }
	   
	   
	   //---------------------------------------------z
	   
	   class FirstFirst extends Namer { //split first last
			public FirstFirst(String s) {
				
				int i = s.indexOf(" "); //find sep space
				if (i > 0) {
					       //left is first name
					first = s.substring(0, i).trim();
					//right is last name
					last =s.substring(i+1).trim();
					}
				else {
					first = ""; // put all in last name
					last = s; // if no space
					}
				}
			
			
			public String  readFullName(){
				return  first + " "+last;
			}
	}
	   
	   //--------------------------------------------------
	   
		 class LastFirst extends Namer {    //split last, first
				public LastFirst(String s) {
				int i = s.indexOf(",");           //find comma
				if (i > 0) {
					//left is last name
					last = s.substring(0, i).trim();
					//right is first name
					first = s.substring(i + 1).trim();
					}
				else {
					last = s; // put all in last name
					first = ""; // if no comma
					}
				}
				
				
				
				public String  readFullName(){
					return  first + " "+last;
				}
		  }
		//--------------------------------------------------
		   
		 class Designation extends Namer {    //split last, first
				public Designation(String s) {
				//int i = s.indexOf(" ");           //find comma
				int firstspace = s.indexOf(" ");
				int lastspace = s.lastIndexOf(" ");
				
				if(firstspace > 0) {
				first = s.substring(firstspace+1, lastspace).trim();	
				last = s.substring(lastspace+1).trim();
				}
				else {
					first="";
					last = s;
				}
		
				
				}
				public String  readFullName(){
					return  first + " "+last;
				}
		  }
   

