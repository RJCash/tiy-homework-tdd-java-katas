/**
 * Created by rickiecashwell on 3/23/17.
 */
public class String3 {
    public static void main(String[] args) {

    }
        public int countTriple(String str) {
        int count =0;
        char character;
        for(int i =0; i < str.length()-2; i++){
            char chars = str.charAt(i);
            if(chars == str.charAt(i+1) && (chars == str.charAt(i+2))){
                count++;
            }

        }
        return count;
    }
}
