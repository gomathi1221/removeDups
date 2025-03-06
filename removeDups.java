// User function Template for Java

class Solution {
    String removeDups(String s) {
    LinkedHashSet<Character> set=new LinkedHashSet<>();
    char[] i=s.toCharArray();
    for(char r:i){
        set.add(r);
    }
    String t="";
    for(char se:set){
        t+=se;
    }
    return t;
    }
}