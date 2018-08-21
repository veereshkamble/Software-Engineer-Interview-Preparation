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

    
}
