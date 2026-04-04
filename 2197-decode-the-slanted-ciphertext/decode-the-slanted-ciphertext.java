class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows==1)
            return encodedText;

        int n=encodedText.length();
        int cols=n/rows;

        StringBuilder ans=new StringBuilder(n);
        for (int i=0;i<cols;i++) {
            int r=0;
            int j=i;
            while(r<rows&&j<cols) {
                ans.append(encodedText.charAt(r*cols+j));
                r++;
                j++;
            }
        }

        int end=ans.length()-1;
        while (end>=0&&ans.charAt(end) ==' ') {
            end--;
        }
        return ans.substring(0, end + 1);
    }
}