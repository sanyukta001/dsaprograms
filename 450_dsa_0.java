

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--)
        {
            sb = sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}