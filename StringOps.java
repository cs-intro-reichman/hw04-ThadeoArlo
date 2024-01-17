public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // System.out.println(capVowelsLowRest("vowels are fun"));
        // System.out.println(camelCase("Hello World"));
        // System.out.println(camelCase("    Intro to coMPUter    sCIEncE"));
        // System.out.println(camelCase(" tWo wordS"));
        int [] index = allIndexOf("Hello World", 'l');
        for (int i=0; i<index.length; i++) {
            System.out.println(index[i]);
        }
        // allIndexOf("Hello World", 'l');
    }

    public static String capVowelsLowRest (String string) {
        String res="";  
        for (int i=0; i<string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a': res+='A';break;
                case 'A': res+='A';break;
                case 'i': res+='I';break;
                case 'I': res+='I';break;
                case 'u': res+='U';break;
                case 'U': res+='U';break;
                case 'e': res+='E';break;
                case 'E': res+='E';break;
                case 'o': res+='O';break;
                case 'O': res+='O';break;
                default: if (string.charAt(i)<90 && 65<string.charAt(i)) {res+=(char)(string.charAt(i)+32);} else {res+=string.charAt(i);}
            }
        }
        return res;
    }

    public static String camelCase (String string) {
        String res="";
        boolean letter1=false; //encountered first letter
        boolean newWord=true;
        for (int i=0; i<string.length(); i++) {
            char c=string.charAt(i);
            if (c==32) {
                newWord=true;
            } else {
                if (letter1) {
                    if (newWord) {
                        res+=cap(c);
                        newWord=false;
                    } else {
                        res+=unCap(c);
                    }
                } else {
                    res+=unCap(c);
                    newWord=false;
                    letter1=true;
                }
            }
        }
        return res;
    }

    public static char unCap (char c) {
        if (65<c && c<90) return(char)(c+32);
        return c;
    }
    public static char cap (char c) {
        if (97<c && c<122) return(char)(c-32);
        return c;
    }

    public static int[] allIndexOf (String string, char chr) {
        int [] res = new int[countChar(string, chr)];
        int j=0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i)==chr) {
                res[j++]=i;
            }
        }
        return res;
    }

    public static int countChar (String string, char c) {
        int count=0;
        for (int i=0; i<string.length(); i++) {
            if (string.charAt(i)==c) count++; 
        }
        return count;
    }
}
