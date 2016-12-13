package org.jgrapht.graph;

import org.jgrapht.DirectedGraph;

import java.io.FileNotFoundException;
import java.util.Set;

/**
 * Created by CoutinhoJ on 13/12/2016.
 */
public class FlowGraphTest {

    FlowGraph graph;
    public void setUp() throws FileNotFoundException {
        graph = new FlowGraph();
        FlowGraphNode va = new FlowGraphNode("a");
        FlowGraphNode v1 = new FlowGraphNode("1");
        FlowGraphNode v2 = new FlowGraphNode("2");
        FlowGraphNode v3 = new FlowGraphNode("3");
        FlowGraphNode v4 = new FlowGraphNode("4");
        FlowGraphNode v5 = new FlowGraphNode("5");
        FlowGraphNode v6 = new FlowGraphNode("6");
        FlowGraphNode v7 = new FlowGraphNode("7");
        FlowGraphNode v8 = new FlowGraphNode("8");
        FlowGraphNode v9 = new FlowGraphNode("9");
        FlowGraphNode v10 = new FlowGraphNode("10");
        FlowGraphNode v11 = new FlowGraphNode("11");
        FlowGraphNode v12 = new FlowGraphNode("12");
        FlowGraphNode v13 = new FlowGraphNode("13");
        FlowGraphNode vl = new FlowGraphNode("l");
        FlowGraphNode v14 = new FlowGraphNode("14");
        FlowGraphNode veq = new FlowGraphNode("eq");
        FlowGraphNode vr = new FlowGraphNode("r");
        FlowGraphNode v21 = new FlowGraphNode("21");
        FlowGraphNode vex = new FlowGraphNode("ex");
        FlowGraphNode v22 = new FlowGraphNode("22");

        graph.addVertex(va);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        graph.addVertex(v7);
        graph.addVertex(v8);
        graph.addVertex(v9);
        graph.addVertex(v10);
        graph.addVertex(v11);
        graph.addVertex(v12);
        graph.addVertex(v13);
        graph.addVertex(vl);
        graph.addVertex(v14);
        graph.addVertex(veq);
        graph.addVertex(vr);
        graph.addVertex(v21);
        graph.addVertex(vex);
        graph.addVertex(v22);
    }

     public void test_flow_through_graph(){
         Set<FlowGraphEdge> edges =  graph.getAllEdges();
         for(FlowGraphEdge e : edges){
             helperTestFlowThroughEdge(e);
         }
     }

     public void helperTestFlowThroughEdge(FlowGraphEdge e){
         graph.
     }

}
