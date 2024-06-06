import java.util.*;

public class map {
    public static String freq(String s){
        Map<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character>maxHeap=new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
        
        maxHeap.addAll(freq.keySet());

        StringBuilder Sorted=new StringBuilder();
        while(!maxHeap.isEmpty()){
            char curr=maxHeap.poll();
            int f=freq.get(curr);
            for(int i=0;i<f;i++){
                Sorted.append(curr);
            }
        }
        return Sorted.toString();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input=sc.nextLine();
        String result=freq(input);
        System.out.println("Output: "+result);
    }
}
