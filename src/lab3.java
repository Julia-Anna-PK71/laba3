public class lab3 {

    public static void main(String[] args) {
        String string = " алла мааааам";
        System.out.println(string);
        String alpha = string.replaceAll("[^а-яА-Я]", "");
        System.out.println(alpha);
        String alphaLowCase = alpha.toLowerCase();
        System.out.println(alphaLowCase);

        int stringLength = alphaLowCase.length();
        String alphaReverse = "";
        for (int i = 0; i < stringLength; i++) {
            alphaReverse = alphaLowCase.charAt(i) + alphaReverse;
        }
        System.out.println(alphaReverse);
        if (alphaLowCase.equals(alphaReverse)) {
            System.out.println("The longest palindrome substring  :" + alpha );
            System.exit(0);
        }
        String longestSubstring = "";
        int maxLen = 1;
        boolean [][] mass = new boolean[stringLength][stringLength];
        for(int l=0; l<stringLength; l++){
            for(int i=0; i<stringLength-l; i++){
                int j = i+l;
                if(alphaLowCase.charAt(i)==alphaLowCase.charAt(j) && (j-i<=2||mass[i+1][j-1])){
                    mass[i][j]=true;

                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        longestSubstring = alphaLowCase.substring(i, j+1);
                        System.out.println(longestSubstring);
                    }
                }
            }
        }
        System.out.println("The longest palindrome substring  :" + longestSubstring);
    }
}

