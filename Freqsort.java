import java.util.*;
public class Freqsort {
    public String frequencysort(String s){
        Map<Character,Integer> map= new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault( c,0)+1);

        }
        List<Character>[] list= new List[s.length()+1];
        for(Character key: map.keySet()){
            int freq = map.get(key);
            if(list[freq]==null){
                list[freq]= new ArrayList<>();
            }
            list[freq].add(key);
    
        }


        StringBuilder sb = new StringBuilder();
        for(int i = list.length-1 ; i>=0;i++){
            if(i!=0){
                for(char h:list[i]){
                    for(int j=0; j<map.get(j);j++){
                        sb.append(h);
                    }
                }

            }
        }
        return sb.toString();
    }

    
}
