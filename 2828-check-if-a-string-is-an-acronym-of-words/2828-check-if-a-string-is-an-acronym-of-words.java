class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder n = new StringBuilder();
        for(String word : words){
            n.append(word.charAt(0));
        }
        return n.toString().equals(s);
    }
}