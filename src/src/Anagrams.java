import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shassanzafar on 6/22/2015.
 */
public class Anagrams {
    HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
    String word1,word2;

    public void Increment()
    {
        for(int i = 0 ; i < word1.length();i++)
        {

            if(!hashMap.containsKey(word1.charAt(i)))
                hashMap.put(word1.charAt(i),1);
            else
            {
                int count = hashMap.get(word1.charAt(i));
                hashMap.put(word1.charAt(i),count++);
            }
        }
    }

    public void Decrement()
    {
        for(int i = 0 ; i < word2.length();i++)
        {

        if(hashMap.containsKey(word2.charAt(i)))
        {
            int subcount = hashMap.get(word2.charAt(i));
            hashMap.put(word2.charAt(i),subcount--);
        }
        else
         {
            hashMap.put(word1.charAt(i),-1);
         }
        }

    }

    public boolean check()
    {
        Increment();
        Decrement();

        if(word1.length() != word2.length())
            return false;

         for(HashMap.Entry<Character,Integer> entry : hashMap.entrySet())
         {
             if(entry.getValue() != 1)
                 return false;
         }
         return true;
    }

    public static void main(String a[])
    {
        Scanner obj = new Scanner(System.in);
        Anagrams anagrams = new Anagrams();

        System.out.println("Enter the first word:");
        String temp1 = anagrams.word1 = obj.next();
        System.out.println("Enter the second word:");
        String temp2 = anagrams.word2 = obj.next();

        System.out.println(anagrams.check());
    }
}
