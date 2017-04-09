//find if 2 strings are anagrams or not of each other
public class anagram{

public static void main(String[] args){
  String str1 = "java";
  String str2 = "avaj";
  //convert these 2 string to char array
  System.out.println("both strings are anagrams:" + anagramCheck(str1, str2));
}
public static boolean anagramCheck(String str1, String str2){
  char[] array1 = str1.toCharArray();
  char[] array2 = str2.toCharArray();
  Arrays.sort(array1);
  Arrays.sort(array2);
  return Arrays.equals(array1, array2);
  
}
}