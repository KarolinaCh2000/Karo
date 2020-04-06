public class Source {
    private static int Hamming(String a, String b){
        char[] DNA1 = a.toCharArray();
        char[] DNA2 = b.toCharArray();
        int counter = 0;
        for(int i = 0; i < a.length(); i++){   //sa takiej samej dlugosci, wiec bez roznicy czy a.length czy b.length
            if(DNA1[i] != DNA2[i])
                counter++;
        }
        return counter;
    }

    private static int immortalRabbits(int n, int k){
        int sum = 2;
        int numberOfPairs;
        for(int i = 0; i < n; i++) {
            numberOfPairs = sum / 2;   //tyle jest par krolikow obecnie(pojedynczy krolik nie bedzie sie rozmnazal) 
            sum += numberOfPairs * k;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Distance of Hamming:");
        int hamming = Hamming("ATGGACAATTAA", "ATGCACAATTTG");
        System.out.println(hamming);

        System.out.println("Kroliki:");
        int rabbits = immortalRabbits(2,3);
        int rabbits1 = immortalRabbits(3,5);
        int rabbits2 = immortalRabbits(3,2);
        System.out.println(rabbits);
        System.out.println(rabbits1);
        System.out.println(rabbits2);
    }
}
