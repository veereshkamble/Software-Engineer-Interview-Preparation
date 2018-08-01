package ArraysAndStrings;

public class AddBinary {

    public String addBinary(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int carry = 0;

        while( i >= 0 || j >= 0){
            int sum = carry;
            if(j>=0) sum += str2.charAt(j--) - '0';
            if(i>=0) sum += str1.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String str1 = "1011";
        String str2 = "1011";
        System.out.println(addBinary.addBinary(str1, str2));
    }
}
