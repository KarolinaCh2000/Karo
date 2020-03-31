import static java.lang.StrictMath.max;

public class DnaRna {
    private static String DnaToRna(String DNA) {
        char[] chars = DNA.toCharArray();
        for (int i = 0, n = chars.length; i < n; i++) {
            if (chars[i] == 'T')
                chars[i] = 'U';
        }
        return new String(chars);
    }

    private static String ReverseDna(String DNA) {
        char[] chars = DNA.toCharArray();
        char[] chars_out = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == 'A')
                chars_out[chars_out.length - 1 - i] = 'T';
            else if (chars[i] == 'T')
                chars_out[chars_out.length - 1 - i] = 'A';
            else if (chars[i] == 'C')
                chars_out[chars_out.length - 1 - i] = 'G';
            else
                chars_out[chars_out.length - 1 - i] = 'C';
        }
        return new String(chars_out);
    }

    private static int[] CountDna(String DNA) {
        char[] chars = DNA.toCharArray();
        int[] array = new int[4];
        for (char aChar : chars) {
            if (aChar == 'A')
                array[0]++;
            else if (aChar == 'C')
                array[1]++;
            else if (aChar == 'G')
                array[2]++;
            else
                array[3]++;
        }
        return array;
    }


    public static void main(String[] args) {
        String a = "ATGGACAATTAA";
        String b = DnaToRna(a);
        String c = ReverseDna(a);
        int[] d = CountDna(a);
        System.out.println("Transkrypcja: " + b);
        System.out.println("Odwrocone dopelnienie: " + c);
        System.out.println("Zliczanie nukleotydow: ");
        for (int i1 : d) System.out.print(i1 + " ");
        System.out.println();
        
        String S1, S2;
        int N, M;
        S1 = "abbacdaktk";
        S2 = "kabackt";
        N = S1.length();
        M = S2.length();
        char[] A = S1.toCharArray();
        char[] B = S2.toCharArray();

        int[][] array = new int[N+1][M+1];
        for (int i = 0; i <= N; i++)
            for (int j = 0; j <= M; j++)
                array[i][j] = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (A[i - 1] == B[j - 1])
                    array[i][j] = array[i - 1][j - 1] + 1;
                else
                    array[i][j] = max(array[i - 1][j], array[i][j - 1]);
            }
        }
        String result = "";
        int i = N, j = M;
        while (i > 0 && j > 0) {
            if (A[i - 1] == B[j - 1]) {
                result = A[i - 1] + result;
                i--;
                j--;
            } else if (array[i - 1][j] > array[i][j - 1])
                i--;
            else j--;
        }
        System.out.println("LongestCommonSubstring: " + result);
    }
}
