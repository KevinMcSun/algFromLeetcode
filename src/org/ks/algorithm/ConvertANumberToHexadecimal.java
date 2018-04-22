package org.ks.algorithm;

/**
 * Created by Kevin on 2016/12/10.
 */
public class ConvertANumberToHexadecimal {
    public static final String[] digit= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public String toHex(int num) {
        StringBuilder reslut = new StringBuilder("");
        if (num > 0) {
            while (num != 0) {
                reslut.insert(0, digit[num % 16]);
                num /= 16;
            }
        } else if (num == 0){
            reslut.insert(0, "0");
        } else {
            reslut.insert(0, digit[num & 15]);
            reslut.insert(0, digit[(num & 240) >> 4]);
            reslut.insert(0, digit[(num & 3840) >> 8]);
            reslut.insert(0, digit[(num & 61440) >> 12]);
            reslut.insert(0, digit[(num & 983040) >> 16]);
            reslut.insert(0, digit[(num & 15728640) >> 20]);
            reslut.insert(0, digit[(num & 251658240) >> 24]);
            reslut.insert(0, digit[((num & 1879048192) >> 28) + 8]);
        }

        return reslut.toString();
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal hexadecimal = new ConvertANumberToHexadecimal();
        System.out.println(hexadecimal.toHex(-13));
    }
}
