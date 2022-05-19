import java.util.ArrayList;
import java.util.StringTokenizer;

public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	       String abc="";
	        int max=0;
	        ArrayList<String> list = new ArrayList<String>();
	       StringTokenizer st = new StringTokenizer("my name is khan ");  
	     while (st.hasMoreTokens()) {  
	           
	         list.add(st.nextToken());
	     }
	     for(int k=0;k<list.size();k++){
	         
	    	 int count=list.get(k).length();
	         System.out.println("count of each word"+count);
	         if(count%2==0){
	             if(count>max){
	                 max=count;
	                 abc=list.get(k);
	             }
	 			}
	 			

	}
	     System.out.println(abc);
	}

}
