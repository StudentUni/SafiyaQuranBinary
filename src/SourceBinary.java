


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SourceBinary {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(new File("C:\\Users\\Abdifatah M Ibrahim\\Documents\\quranText.txt"));
            List<String> lines = new ArrayList<String>();

            //parsing the Qur'an into an ArrayList of Strings: lines(Verses)
            while (sc.hasNextLine())
            {
                lines.add(sc.nextLine());
            }

            //Dump the ArrayList:Lines into an Array of Strings: arr[]
            String[] arr = lines.toArray(new String[0]);

            try {

                //arr2[] initialized to same length as arr[]
                String[] arr2 = new String[arr.length];
                String aa = "";

                //Changing the Verse|Lines to into non-spaced String
                for(int i = 0; i < arr.length; i++)
                {
                    aa = "";
                    for(int x = 0; x <= (arr[i].length())-1; x++)
                    {
                        if(arr[i].charAt(x) == ' ')
                        {
                            //skip if its a space
                        }
                        else
                        {
                            //add the character to the String aa
                            aa += Character.toString(arr[i].charAt(x));
                        }
                    }
                    //Add the non spaced string:aa to the arr2[]
                    arr2[i] = aa;
                }

                System.out.println("arr2 length " + arr2.length);

                int result = 0, num = 0, z = 0;

                //Loops through the entire Quran to count the number of letters
                //looks for char num falls in which verse
                for(int i = 0; i < arr2.length; i++)
                {
                    //where is num coming from?
                    if(num >= 50000)
                    {
                        //if the count is reached save the current index(Verse) and exit
                        result = i;
                        break;
                    }
                    else
                    {
                        //if not, continue counting the number of char in the verse(z) and add to total char cout(num)
                        z = 0;
                        for(int x = 0; x <= (arr2[i].length())-1; x++)
                            {
                                z=z+1;
                            }
                    num = num + z;
                    }
                }

            System.out.println("result2  = " + result);
                
                
                int[] arr_num=new int[]{7,286,200,176,120,165,206,75,129,109,123,111,43,52,99,128,
                  111,110,98,135,112,78,118,64,77,227,93,88,69,60,34,30,73,54,45,83,182,88,75,85,
                  54,53,89,59,37,35,38,29,18,45,60,49,62,55,78,96,29,22,24,13,14,11,11,18,12,12,
                  30,52,52,44,28,28,20,56,40,31,50,40,46,42,29,19,36,25,22,17,19,26,30,20,15,21
                      ,11,8,8,19,5,8,8,11,11,8,3,9,5,4,7,3,6,3,5,4,5,6};  
          
    
              
             int number=0,result_number=0,aya=0,c=0;
             for(int i=0;i<arr_num.length;i++){
                 number+=arr_num[i];
                 if(i==0){
                     
                 }else{
                c+=arr_num[(i-1)];
                 }
                 
                  if(result<=number){  
              
                      result_number=i;
                     aya=result-c;
                   
                    break;
                 }
             }  
              
            
        
                System.out.println("aya "+aya + " number of surah = "+(result_number+1));
               

            } catch (Exception ex)
                {
                    //catch errors
                }
        } catch (FileNotFoundException e)
             {
                e.printStackTrace();
             }

    }//Main

}//End SourceBinary
