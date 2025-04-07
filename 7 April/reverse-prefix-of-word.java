class Solution {
    public String reversePrefix(String word, char ch) {
        int c = -1;

        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                c = i;
                break;
            }
        }

        if (c == -1) {
            return word;
        }

        int s = 0, e = c;
        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return new String(arr);
    }
}
