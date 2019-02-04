public class Runner {

    // Warm up 1 - hasTeen
    public boolean hasTeen(int a, int b, int c) {
        if((13 <= a && 19 >= a) || (13 <= b && 19 >= b) || (13 <= c && 19 >= c)){
            return true;
        }else{
            return false;
        }
    }


    // Warm up 2 - noTriples
    public boolean noTriples(int[] nums) {
        boolean x = true;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]){
                x = false;
            }
        }
        return x;
    }


    // String 1 - makeOutWord
    public String makeOutWord(String out, String word) {
        String x = out.substring(0, 2);
        String y = out.substring(2);
        String z = x + word;
        return z + y;
    }


    // String 2 - countCode
    public int countCode(String str) {
        int count = 0;
        for(int i = 3; i < str.length(); i++){
            if(str.substring(i - 3, i - 2).equals("c") &&
                    str.substring(i - 2, i - 1).equals("o") &&
                    str.substring(i, i + 1).equals("e")){
                count = count + 1;
            }
        }
        return count;
    }


    // String 3 - countTriple
    public int countTriple(String str) {
        int count = 0;
        for(int i = 2; i < str.length(); i++){
            if(str.substring(i - 2, i - 1).equals(str.substring(i - 1, i)) &&
                    str.substring(i - 1, i).equals(str.substring(i, i + 1))){
                count = count + 1;
            }
        }
        return count;
    }

    // Array 1 - start1
    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length >= 1){
            if(a[0] == 1){
                count = count + 1;
            }
        }
        if(b.length >= 1){
            if(b[0] == 1){
                count = count + 1;
            }
        }
        return count;
    }


    // Array 2 - only14
    public boolean only14(int[] nums) {
        boolean only14 = true;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 4 && nums[i] != 1){
                only14 = false;
            }
        }
        return only14;
    }

    // Array 3 - fix34
    public int[] fix34(int[] nums) {
        int temp=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] == 4){
                        temp = nums[i+1];
                        nums[i + 1] = 4;
                        nums[j] = temp;
                    }

                }
            }
        }
        for(int k = temp; k < nums.length; k++){
            if(nums[k] == 4){
                for(int l = k; l < nums.length; l++){
                    if(nums[l] == 3){
                        int temp2 = nums[l+1];
                        nums[l] = 3;
                        nums[k] = temp2;

                    }
                }
            }
        }
        return nums;
    }


    // Logic 1 - greenTicket
    public int greenTicket(int a, int b, int c) {
        boolean all = false;
        boolean half = false;
        int num = 0;
        if(a == b && b == c){
            all = true;
        }
        if(a == b || b == c || a == c){
            half = true;
        }
        if(all == true){
            num = 20;
        }else{
            if(half == true){
                num = 10;
            }
        }
        return num;
    }


    // Logic 2 - noTeenSum
    public int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if(a >= 13 && a <= 19){
            if(a != 15 && a != 16){
                a = 0;
            }
        }
        if(b >= 13 && b <= 19){
            if(b != 15 && b != 16){
                b = 0;
            }
        }
        if(c >= 13 && c <= 19){
            if(c != 15 && c != 16){
                c = 0;
            }
        }
        sum = sum + a + b + c;
        return sum;
    }

}
