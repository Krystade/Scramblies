public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        String[] s1 = new String[str1.length()];
        String[] s2 = new String[str2.length()];
        int[] truth = new int[str2.length()];
        boolean same = true;
        
        for (int i = 0; i < str1.length(); i++){
            s1[i] = str1.substring(i , i + 1);
        }
        
        for (int i = 0; i < str2.length(); i++){
            s2[i] = str2.substring(i , i + 1);
            for (int j = 0; j < str1.length(); j++){
                if (s2[i].compareTo(s1[j]) == 0){
                    truth[i] = 1;
                    s1[j] = "-";
                    break;
                }
            }
        }
        for (int test : truth){
            if (test == 0){
                same = false;
            }
                }
        return same;
    }
}
