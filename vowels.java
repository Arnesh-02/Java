import java.util.*;

public class vowels{
public static void main (String[] args) {
    Scanner obj =new Scanner(System.in);
    char [] vowel ={'a','e','i','o','u'};
    System.out.println("Enter a letter:");
    char letter=obj.next().charAt(0);
    for (char i: vowel){
        if(i==Character.toLowerCase(letter)){
            System.out.println("Entered letter is  a vowel");
            return;
        }
    }
    System.out.println("Entered letter is a consonant");
    
}
}