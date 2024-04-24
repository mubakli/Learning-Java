public class Main {
    public static void main(String[] args) {
        String input = "abcaabbccacbcdabab";
        System.out.println(findLongestOne(input));

    }
    public static String findLongestOne(String str){
        int maxLength = 0;
        String longestString = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String sub = str.substring(i,j);
                int count = countSubs(str,sub);
                if(count > 1 && sub.length() > maxLength){
                    maxLength = count;
                    longestString = sub;
                }
            }

        }
        return longestString;
    }
    public static int countSubs(String str, String sub){
        int count = 0;
        int lastIndex = 0;
        while((lastIndex = str.indexOf(sub,lastIndex)) != -1){
            count ++;
            lastIndex += sub.length();
        }
        return count;
    }
}

