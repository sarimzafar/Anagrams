# Anagrams
Check if two strings are Anagrams or not in Linear time and Constant space

True  -> Yes, they are anagrams
False -> No, they are not anagrams


Pseudocode:

if(str1 -> length != str2->lenght)
  return false

use: hashtable<Character,Integer>

else
  for each character key in str1
    increment the integer value in the hashtable
  
  for each character key in str2
    decrement the integer value in the hashtable
    
if(declare entryset)
  entrySet.getValue() != 0
    return false;

else 
  return true;
