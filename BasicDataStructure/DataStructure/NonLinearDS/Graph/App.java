package dataStructure.BasicDataStructure.DataStructure.NonLinearDS.Graph;

public class App {
    public static void main(String[] args)
    {
        Graph obj1 = new Graph(5);
        obj1.addEdge(0,1);
        obj1.addEdge(0,2);
        obj1.addEdge(0,3);

        obj1.addEdge(1,2);
        obj1.addEdge(1,4);

        obj1.addEdge(2,3);

        obj1.addEdge(3,1);

        obj1.addEdge(4,0);
        obj1.addEdge(4,3);

        for(int i=0; i<5 ; i++) {
            int src = i;
            Object values[] = obj1.showAdjacent(src);

            System.out.print(src + " -> ");
            for (Object val : values) {
                System.out.print(val + " --> ");
            }

            System.out.print(" none");
            System.out.println();
        }
    }


}
