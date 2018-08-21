package InterviewProcess;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {

        S = S.replaceAll("[-]", "");
        S = S.toUpperCase();

        StringBuilder sb = new StringBuilder();
        sb.append(S);

        int i=sb.length()-K;
        while(i>0) {
            sb.insert(i, '-');
            i = i-K;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        System.out.println(licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 2));
    }
}
