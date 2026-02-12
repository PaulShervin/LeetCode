class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            while(left < right && !isVowel(arr[left]))
            {
                left++;
            }

            while(left < right && !isVowel(arr[right]))
            {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public boolean isVowel(char n)
    {
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'
        ||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            return true;
        }
        return false;
    }
}
