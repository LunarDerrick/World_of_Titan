package world_of_titan;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Scouting {
    // set up 2.3 Scouting Mission inside the Wall data here
    // store all mapNode data
    private ArrayList<LinkedList> map = new ArrayList();
    private int start, numOfVertices;
    private boolean hasCycle = false;
    private ArrayList<Integer> cycle = new ArrayList();    
    
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
    
    // getter method for mapNode
    public LinkedList getMapNode(int index) {
        return map.get(index);
    }
    
    /** findPath(): accepts one integer then construct a path to search all points without repetition, aka Hamiltonian cycle.
     * output path if found, else output no path found. may output multiple paths.
     * required helper function: findCycle(), solve()
     */
    public void findPath() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        int input = sc.nextInt();

        findCycle(input);
    }
    
    /** findCycle(int input): initialize variables to start searching a Hamiltonian cycle.
     * output failure if no cycle is found over here
     * accepts argument from findPath()
     * 
     * @param input: starting point to find a Hamiltonian cycle.
     */
    public void findCycle(int input) {
        start = input;
        numOfVertices = map.size();
        cycle.add(start);
        boolean[] visited = new boolean[numOfVertices];
        visited[start] = true;        
        solve(start, visited);
        
        if (!hasCycle) {
            System.out.println("\nNo path found.\n");
        }
    }
    
    /** solve(int vertex, Boolean[] visited): search path for Hamiltonian cycle.
     * navigate mapNode once at a time, it checks all adjacent mapNode then jumps to the next available mapNode.
     * if reach dead end, it back tracks and choose next available mapNode.
     * output success if there is any possible cycle found
     * 
     * @param vertex: current mapNode pointer value
     * @param visited: checklist for whether a mapNode has been saved into the path or not.
     */
    private void solve(int vertex, boolean[] visited) {
        if (vertex == start && cycle.size() == numOfVertices+1) {
            hasCycle = true;
            System.out.println("\nPath found!\n");
            for (int i = 0; i < cycle.size()-1; i++) {
                System.out.print(cycle.get(i) + "-->");
            }
            System.out.println(cycle.get(cycle.size()-1));
            return;
        }
        
        if (cycle.size() == numOfVertices)
            visited[start] = false;
        else
            visited[start] = true;
        
        for (int i = 1; i < getMapNode(vertex).size(); i++) {
            int neighbourVertex = (int)getMapNode(vertex).get(i);
            
            if (!visited[neighbourVertex]) {
                visited[neighbourVertex] = true;
                cycle.add(neighbourVertex);
                
                solve(neighbourVertex, visited);
                
                visited[neighbourVertex] = false;
                cycle.remove(cycle.size()-1);
            }
        }
    }
}