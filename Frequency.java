import java.util.*;
public class Frequency{
	public static void main(String[]args){
	
	}
}




import java.util.Scanner;
public class main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the sentence:");
String s = sc.nextLine();
System.out.println("Enter the word to be searched:");
String word = sc.next();
int count = 0;
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == word.charAt(0)) {
int j = i;
int k = 0;
while (j < s.length() && k < word.length()) {
if (s.charAt(j) == word.charAt(k)) {
k++;
}
j++;
}
if (k == word.length()) {
count++;
}
}
}
System.out.println("Frequency of " + word + " in the sentence is: " + count);
}
}