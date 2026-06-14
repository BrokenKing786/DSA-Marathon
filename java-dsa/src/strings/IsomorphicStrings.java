package strings;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "FOOLS";
        String s2="BOKRS";

        System.out.println(isomorphicOrNot(s1, s2));

    }

    public static boolean isomorphicOrNot(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] s1Map=new int[256];
        int[] s2Map=new int[256];

        for(int i=0;i<s1.length();i++){
            char s1Char=s1.charAt(i);
            char s2Char=s2.charAt(i);

            if(s1Map[s1Char]!=0 || s2Map[s2Char]!=0){

                if(s1Map[s1Char]!=s2Char+1  || s2Map[s2Char]!=s1Char+1){
                    return false;
                }

            }
            s1Map[s1Char]=s2Char+1;
            s2Map[s2Char]=s1Char+1;
        }

        return true;



    }
}
