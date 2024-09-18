//Reverse Words in a String

class ReverseWords {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder rev = new StringBuilder();

        for(int i = arr.length - 1; i > 0; i--) {
            rev.append(arr[i]).append(" ");
        }

        rev.append(arr[0]);

        return rev.toString();

    }

}