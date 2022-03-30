import java.util.Arrays;

public class Q3Anagram{
    public void checkAnagram(){
        String str1 = "Listen";
        String str2 = "Silent";
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
    }
    public static void main(String[] args) {
        Q3Anagram anagram = new Q3Anagram();
        anagram.checkAnagram();
    }
}