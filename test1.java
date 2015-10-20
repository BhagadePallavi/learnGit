
public class test1 
{
	
	static int sum(int n)
    {
        int sum = (n * (n+1))/ 2;
 
        return sum;
    }
 
    //Method to calculate sum of all elements of array
 
    static int sumOfArrayElements(int[] array)
    {
        int sum = 0;
 
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
            
        }
 
        return sum;
    }
 
    static int duplicateElement(int[] array)
    {
        int duplicatenumber = 0;
 
        for (int i = 0; i < array.length-1; i++)
        {
        	for (int j = i+1; j < array.length; j++)
            {
        		if(array[i]==array[j])
        			duplicatenumber=array[i];
            }
        }
 
        return duplicatenumber;
    }
public static void main (String s[]){
	 
	/*test1 t=new test1();
	t.findMissingNumber();*/
	int n = 10;
	 
    int[] a = {1, 4, 2, 3, 5, 8, 6,9,10,3};
    int sum = sum(n);
    int sumOfArrayElements = sumOfArrayElements(a);
    int duplicateNumber = duplicateElement(a);
    int missingNumber = sum - sumOfArrayElements+duplicateNumber;

    System.out.println("Missing Number is = "+missingNumber);
}

public void findMissingNumber()
{
	 int[] arr = {10,9,3,6,4,7,1,2,5};  
     int length = arr.length;  
       
     int indexes = 10;  
     int values = 0;  
       
     for (int i = 0; i < length; i++) {  
         indexes += i+1;  
         values += arr[i];  
     }  
       
     int result = indexes - values;  
       
     System.out.println("Missing number is: "+result);  
 
}

}
