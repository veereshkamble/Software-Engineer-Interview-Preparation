package Grammarly;

public class SpreadSheetNotationConversion {

    public String convertToSpreadSheetNotation(long n) {
        StringBuilder result = new StringBuilder();
        long k = n;
        long ans = 1;

        ans = k / 702;

        if(k % 702 != 0) {
            ans++;
        }

        n = n- (702 * (ans - 1));

        while(n > 0) {
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        result.insert(0, ans);
        return result.toString();
    }
}


