import java.util.*;

class Main{
    public static void main(String[] args){
        System.out.println(two(100));
    }

    public static ArrayList<Integer> one(int n){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 2; i<=n; i++){
            ar.add(i);
        }
        for(int p = 2; p<n; p++){
            for(int j = 2*p; j<=n; j+=p){
                if(ar.indexOf(j)!=-1)
                    ar.remove(ar.indexOf(j));
            }
        }
        return ar;
    }

    public static String two(int n){
        ArrayList<Integer> ar = one(n);
        for(int i:ar){
            if(ar.contains(n-i)) return i + " " + (n-i);
        }
        return "-1";
    }

    public static ArrayList<Integer> three(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> big;
        ArrayList<Integer> sma;
        if(a.size()>b.size()){ 
            big = a;
        }
        else {
            big = b;
        }
        big.add(0, 0);
        
    }
}