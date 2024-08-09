class permutation_no_repetition {
    public static void main(String[] args) {
        String s = "aba";
        printNo(s, "");
    }

    public static void printNo(String s, String ans) {
        if (ans.length() == s.length()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < ans.length(); j++) {
                if (s.charAt(i) == ans.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                printNo(s, ans + s.charAt(i));
            }
        }
    }
}
