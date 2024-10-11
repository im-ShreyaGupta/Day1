import java.io.*;
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
//min aur sec sm hi rahega
    public static String timeConversion(String s) {//07:05:45PM
    // Write your code here
    String period=s.substring(8,10);//8&9ko lega
    int hr=Integer.parseInt(s.substring(0,2));//0&1
    String min=s.substring(3,5);
    String sec=s.substring(6,8);
    //conversion
    if(period.equals("AM")){
        if(hr==12){
            hr=0;
        }
    }
    if(period.equals("PM")){
        if(hr!=12){
            hr=hr+12;
        }
    }
    String militaryhour =String.format("%02d",hr);//2 se kum digits raha hr mei to age 0 put ho jayenge
    String time24 = militaryhour +":"+ min +":"+ sec;
    return(time24);
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter time in format hh:mm:ss(AM/PM)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        String s = bufferedReader.readLine();//12time format

        String result = Result.timeConversion(s);

        System.out.println(result);
        bufferedReader.close();
    }
}
