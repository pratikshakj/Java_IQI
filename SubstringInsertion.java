public class SubstringInsertion {
    public static void main(String[] args) {
       Scanner sc = new Scanner(system.in);
	   
	   System.out.println("Orginal string:");
	   String mainStr = sc.nextLine();
	   
	   System.out.println("Substring string:");
	   String subStr = sc.nextLine();

	   System.out.println("Position:");
	   String position = sc.nextLine();
	   
        String result = insertSubstring(mainStr, subStr, position);
        System.out.println("Output: " + result);
    }

    public static String insertSubstring(String mainStr, String subStr, int position) {
        if (position < 0 || position > mainStr.length()) {
         
            return mainStr;
        }

   
        char[] result = new char[mainStr.length() + subStr.length()];

        for (int i = 0; i < position; i++) {
            result[i] = mainStr.charAt(i);
        }

   
        for (int i = 0; i < subStr.length(); i++) {
            result[position + i] = subStr.charAt(i);
        }


        for (int i = position; i < mainStr.length(); i++) {
            result[i + subStr.length()] = mainStr.charAt(i);
        }

        return new String(result);
    }
} 