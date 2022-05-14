package world_of_titan;
import java.util.LinkedList;

public class Scouting {
    // set up 2.3 Scouting Mission inside the Wall data here
    // store all mapNode data
    private java.util.ArrayList<LinkedList> map = new java.util.ArrayList();
    
    /** mapNode(): constructs a new mapNode to be added to map.
     * A complete mapNode will be in the format:
     * [a, b, c...]
     * a = current mapNode's value
     * b, c = subsequent adjacent mapNode's value
     * For example, [0, 1, 5, 7] means mapNode "0" is adjacent to "1", "5" and "7".
     * 
     * @param startingValue: current mapNode's own value
     * @param numberOfAdjacentNodes: number of mapNodes adjacent to current mapNode
     * @param values: an array of every adjacent mapNode value
    */
    public void mapNode(int startingValue, int numberOfAdjacentNodes, int[] values) {
        LinkedList mapNode = new LinkedList();
        
        mapNode.addLast(startingValue);
        for (int i = 0; i < numberOfAdjacentNodes; i++)
            mapNode.addLast(values[i]);
        
        map.add(mapNode);
    }
    
    // to view current map data
    @Override
    public String toString() {
        return "Map: " + map.toString() +
                "\nNodes: " + map.size();
    }
}
