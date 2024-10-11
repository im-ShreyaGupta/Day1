import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     
    public static void plusminus(List<Integer> arr) {
    // Write your code here
    float p=0;
    float n=0;
    float z=0;
    for (int i=0;i<arr.size();i++)
    {
        if (arr.get(i) >0)
        {
            p++;
        }
        if (arr.get(i)<0)
        {
            n++;
        }
        if (arr.get(i)==0)
        {
            z++;
        }
    }
   System.out.println(String.format("%.6f",p/arr.size())); 
   System.out.println(String.format("%.6f",n/arr.size()));
   System.out.println(String.format("%.6f",z/arr.size()));
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of elements");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(" elements as string");
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusminus(arr);

        bufferedReader.close();
    }
}