import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,4,7,8};
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		ArrayList arraylist = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			arraylist.add(arr[i]);
		}	
		for(int i=0;i<10;i++)
		{
			if(!arraylist.contains(arr1[i]))
			{
				sum=sum+arr1[i];
				
			}
		}
	System.out.println(sum);
	}
	}


