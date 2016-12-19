public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        String [] s1 = str1.split("");
        String [] s2 = str2.split("");
        int[] truth = new int[str2.length()];
        boolean same = true;
        
        for (int i = 0; i < str2.length(); i++){
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
        System.out.println(same);
        //return same;
    }
}
