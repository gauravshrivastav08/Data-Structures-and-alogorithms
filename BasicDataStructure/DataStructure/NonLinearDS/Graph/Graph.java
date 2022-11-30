package dataStructure.BasicDataStructure.DataStructure.NonLinearDS.Graph;

import java.util.ArrayList;

public class Graph {
   private int vCount;
   private int eCount;

   private ArrayList<Integer> adjacent[];    // Each element of an Array would have a list, i.e. Array of Integer List

   public Graph(int vCount)
   {
       this.vCount = vCount;
       this.eCount = 0;

       adjacent = new ArrayList[vCount];
       for (int i=0; i<vCount; i++)
       {
           adjacent[i] = new ArrayList<>();  // Defined each Array element as empty list
       }
   }

   public int getVertexCount()
       {
           return vCount;
       }

   public int getEdgesCount()
       {
           return eCount;
       }

   public void addEdge(int src, int dst)
   {
       adjacent[src].add(dst);
       eCount++;
   }

   public Object[] showAdjacent(int src)
   {
       return adjacent[src].toArray();
   }

}
