import java.util.*;

class Main{
    public static void main(String[] args){
        
        System.out.println(add(new ArrayList<Integer>(Arrays.asList(9, 9, 9)), new ArrayList<Integer>(Arrays.asList(8, 7, 6))));
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

    public static ArrayList<Integer> add(ArrayList<Integer> big, ArrayList<Integer> sma){
        if(sma.size()>big.size()){
            ArrayList<Integer> tmp = big;
            big = sma;
            sma = tmp;
        }
        big.add(0, 0);
        for(int i = 0; i<sma.size(); i++){
            big.set(big.size()-1-i, big.get(big.size()-1-i) + sma.get(sma.size()-1-i));
        }
        for(int i = big.size()-1; i>0; i--){
            if(big.get(i)>9){
                big.set(i, big.get(i)-10);
                big.set(i-1, big.get(i)+1);
            }
        }
        return big;
    }
}