class Solution {
    public String reverseWords(String s) {
        StringBuilder newSb = new StringBuilder();

       String[] words = s.split(" ");

       for(String word : words){
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            newSb.append(temp);
            newSb.append(" ");
       } 
       return newSb.toString().trim();
    }
}
