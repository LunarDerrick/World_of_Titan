package world_of_titan;

import java.util.*;

public class WallOfMaria {
    public WallOfMaria(){
    }

    public ArrayList<Integer> getMost(List<Integer> index, int t){
        int max = 0;
        ArrayList<Integer> most = new ArrayList<>();
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
        return most;
    }
}