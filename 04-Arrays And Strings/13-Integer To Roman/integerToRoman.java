//https://leetcode.com/problems/integer-to-roman/solutions/?envType=study-plan-v2&envId=top-interview-150
public class integerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    public static String intToRoman(int num) {
        String finalRom = "";
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rom={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i = 0; i <nums.length ; i++)
        {
            while (num >= nums[i]) {
                    finalRom += rom[i];
                    num -= nums[i];
            }
        }
        return finalRom;
    }
}
