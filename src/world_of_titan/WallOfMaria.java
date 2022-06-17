package world_of_titan;

import java.util.*;

public class WallOfMaria {
    public WallOfMaria(){

    }
    public String getMost(List<Integer> index, int t){
        String store = "";
        int max = 0;
        LinkedList<Integer> most = new LinkedList<>();
        int [] arr = new int[t];
        for(int p=0; p<index.size(); p++) {
            for (int q=p+1; q<index.size(); q++) {
                if (index.get(p) == index.get(q)) {
                    arr[index.get(p)]++;
                    if (arr[index.get(p)] >= max) {
                        max = arr[index.get(p)];
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            if (arr[i] == max) {
                most.add(i);
            }
        }
        while(!most.isEmpty()){
            if(most.size() ==1){
              store+=most.pop();
            }else{
         store += most.pop()+",";
            }
        }
      return store;  
    }
}
