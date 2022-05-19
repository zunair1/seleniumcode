
import java.lang.*;
import java.util.ArrayList;

public class t2 {


	public static void main(String []args){
	String word="";
String abc="";
	int max=0;
	ArrayList<String> list = new ArrayList<String>();

	String z="I love Quality Assurance and Pakistan Zindabad";

	for(int i=0;i<z.length();i++)
	{

	if(z.charAt(i)!=' ')
	{
	word=word+z.charAt(i);

	}


	else {
	list.add(word);
	word="";

	}



	}
	list.add(word);


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


