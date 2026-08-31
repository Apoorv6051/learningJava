package searching;

public class searchInString  {
    public static void main(String[] args) {
        String b=" apoorv";
        char target = 'r';
        System.out.println(searchInString(b,target));

    }  
    static boolean searchInString(String str,char target){
        if(str == null || str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }

        }
        return false;


    }
}
