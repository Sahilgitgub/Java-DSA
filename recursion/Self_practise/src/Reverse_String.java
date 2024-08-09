public class Reverse_String {
    public static void reverseStr(String str, int i, int j) {
        if (i >= j) {
            System.out.println(str);
            return;
        }
        char[] charArray = swap(str.toCharArray(), i, j);
        reverseStr(new String(charArray), i + 1, j - 1);
    }

    public static char[] swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    public static void main(String[] args) {
        String str = "Sahil";
        reverseStr(str, 0, str.length() - 1);
    }
}
