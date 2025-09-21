class Solution {
    public boolean isAnagram(String s, String t) {

        // if(s.length()!=t.length()){
        //     return false;
        // }
        // char[] a=t.toCharArray();
        // for(int i=0;i<s.length();i++){
        //         boolean b=false;
        //     for(int j=0;j<a.length;j++){
        //         if(s.charAt(i)==a[j]){
        //             a[j]='#';
        //             b=true;
        //             break;
        //         }
        //     } 
        // if(!b){
        //     return false;         
        // }
        // }
        // return true;

        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}