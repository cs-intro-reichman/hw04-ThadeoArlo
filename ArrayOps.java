public class ArrayOps {
    public static void main(String[] args) {
        int[] asdf = {0,1,2,3,4,6,6};
        // int[] qwer = {1,2,4};
        // System.out.println(findMissingInt(asdf));
        System.out.println(secondMaxValue(asdf));
        // System.out.println(containsTheSameElements(asdf, qwer));
        // System.out.println(isSorted(asdf));
 
    }
    
    public static int findMissingInt (int [] array) {
        int n=array.length;
        int sumTrue = (n*(n+1)/2); 
        int sum=0;
        for (int i : array) {
            sum+=i;
        }
        return sumTrue-sum;
    }

    public static int secondMaxValue(int [] array) {
        int max=0;
        int max2=0;
        int count=0;
        for (int i : array) {
            if (i>max) {max=i;}
        }
        for (int i : array) {
            if (i==max) count++;
        }
        if (count>1) {return max;}
        for (int i : array) {
            if (max>i && max2<i) {max2=i;}
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean truthAll = true;
        boolean[] truth = new boolean[Math.max(array1.length, array2.length)];
        int[] arrLong = (array1.length>=array2.length) ? array1 : array2 ;
        int[] arrShort = (array1.length>=array2.length) ? array2 : array1 ;
        for (int i=0; i<arrLong.length; i++) {
            for (int j : arrShort) {
                if (j==arrLong[i]) {
                    truth[i]=true;
                    break;
                } else truth[i]=false;
            }
        }
        for (boolean i : truth) {
            if (i==false) truthAll = false;
        }
        return truthAll;
    }

    public static boolean isSorted(int [] array) {
        boolean asc=true;  
        boolean desc=true;
        for (int i=0; i<array.length-1; i++) {
            if (array[i]<array[i+1]) {
                desc=false;
            } else if (array[i]>array[i+1]) {
                asc=false;
            }
        }
        return asc||desc;
    }

}
