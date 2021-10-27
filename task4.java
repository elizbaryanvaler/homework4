public class task4 {
    public static void main(String[] args) {
        String s = "hello im student";
        String[] word = s.split(" ");
        String longword = word[0];
        for (int i = 1; i < word.length; i++) {
            if (longword.length() <= word[i].length()) {
                longword = word[i];
            }
        }

        System.out.println("longword is;  " + longword);
    }
}
