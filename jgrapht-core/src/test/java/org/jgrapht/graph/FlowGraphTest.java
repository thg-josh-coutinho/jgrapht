package org.jgrapht.graph;

import junit.framework.TestCase;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by CoutinhoJ on 13/12/2016.
 */
public class FlowGraphTest extends TestCase {

    FlowGraph graph;
    Map<String, FlowGraphNode> nodeMap;
    public void setUp() throws FileNotFoundException {
        graph = new FlowGraph();
        nodeMap = new HashMap<String, FlowGraphNode>();

        FlowGraphNode va = new FlowGraphNode("a");
        nodeMap.put("a", va);
        FlowGraphNode v1 = new FlowGraphNode("1");
        nodeMap.put("1", v1);
        FlowGraphNode v2 = new FlowGraphNode("2");
        nodeMap.put("2", v2);
        FlowGraphNode v3 = new FlowGraphNode("3");
        nodeMap.put("3", v3);
        FlowGraphNode v4 = new FlowGraphNode("4");
        nodeMap.put("4", v4);
        FlowGraphNode v5 = new FlowGraphNode("5");
        nodeMap.put("5", v5);
        FlowGraphNode v6 = new FlowGraphNode("6");
        nodeMap.put("6", v6);
        FlowGraphNode v7 = new FlowGraphNode("7");
        nodeMap.put("7", v7);
        FlowGraphNode v8 = new FlowGraphNode("8");
        nodeMap.put("8", v8);
        FlowGraphNode v9 = new FlowGraphNode("9");
        nodeMap.put("9", v9);
        FlowGraphNode v10 = new FlowGraphNode("10");
        nodeMap.put("10", v10);
        FlowGraphNode v11 = new FlowGraphNode("11");
        nodeMap.put("11", v11);
        FlowGraphNode v12 = new FlowGraphNode("12");
        nodeMap.put("12", v12);
        FlowGraphNode v13 = new FlowGraphNode("13");
        nodeMap.put("13", v13);
        FlowGraphNode vl = new FlowGraphNode("l");
        nodeMap.put("l", vl);
        FlowGraphNode v14 = new FlowGraphNode("14");
        nodeMap.put("14", v14);
        FlowGraphNode veq = new FlowGraphNode("eq");
        nodeMap.put("eq", veq);
        FlowGraphNode vr = new FlowGraphNode("r");
        nodeMap.put("r", vr);
        FlowGraphNode v21 = new FlowGraphNode("21");
        nodeMap.put("21", v21);
        FlowGraphNode vex = new FlowGraphNode("ex");
        nodeMap.put("ex", vex);
        FlowGraphNode v22 = new FlowGraphNode("22");
        nodeMap.put("22", v22);

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


        graph.addEdge(veq, v21);
        graph.addEdge(v21, v1);
        graph.addEdge(v1, v2);
        graph.addEdge(v2, v3);
        graph.addEdge(v3, v3);
        graph.addEdge(v3, v14);
        graph.addEdge(v3, v4);
        graph.addEdge(v14, v4);
        graph.addEdge(v4, v22);
        graph.addEdge(v4, v5);
        graph.addEdge(v22, v5);
        graph.addEdge(v5, v6);
        graph.addEdge(v6, v7);

        graph.addEdge(v6, v8);

        graph.addEdge(v1, v10);

        graph.addEdge(v10, v11);

        graph.addEdge(v11, v12);

        graph.addEdge(v11, v13);

        graph.addEdge(v4, v9);

        graph.addEdge(v9, v2);

        graph.addEdge(v2, v11);

        graph.addEdge(v10, v1);

        graph.addEdge(v1, v11);

    }

     public void test_flow_through_graph(){
         for(String v1 : nodeMap.keySet()) {
             for (String v2 : nodeMap.keySet()) {
                 FlowGraphEdge e = graph.getEdge(nodeMap.get(v1), nodeMap.get(v2));
                 if(e != null) {
                     helperTestFlowThroughEdge(e, 4);
                 }
             }
         }
     }

    public void test_flows_through_graph() {

        for(String v1 : nodeMap.keySet()) {
            for (String v2 : nodeMap.keySet()) {
                FlowGraphEdge e = graph.getEdge(nodeMap.get(v1), nodeMap.get(v2));
                if (e != null) {
                    helperTestFlowsThroughEdge(graph.getEdge(nodeMap.get(v1), nodeMap.get(v2)));

                }
            }
        }
    }

    public void test_reset_flow_through_graph() {

        for(String v1 : nodeMap.keySet()) {
            for (String v2 : nodeMap.keySet()) {
                FlowGraphEdge e = graph.getEdge(nodeMap.get(v1), nodeMap.get(v2));
                if (e != null) {
                    helperTestResetFlowThroughEdge(graph.getEdge(nodeMap.get(v1), nodeMap.get(v2)));

                }
            }
        }
    }

    private void helperTestResetFlowThroughEdge(FlowGraphEdge e){
        graph.setEdgeWeight(e, 0);
        e.resetFlow();
        graph.setEdgeWeight(e, 20);
        graph.setEdgeWeight(e, 15);
        assert e.getFlow() == -5;

        graph.setEdgeWeight(e, 15);
        assert e.getFlow() == 0;

        e.resetFlow();

        assert e.getFlow() == 0;

        graph.setEdgeWeight(e, 30);

        assert e.getFlow() == 15;

    }

    private void helperTestFlowThroughEdge(FlowGraphEdge e, int newWeight){
        graph.setEdgeWeight(e, 0);
        e.resetFlow();

        graph.setEdgeWeight(e, newWeight);

        assert e.getFlow() == newWeight;

    }

    private void helperTestFlowsThroughEdge(FlowGraphEdge e){
        graph.setEdgeWeight(e, 0);
        e.resetFlow();
        graph.setEdgeWeight(e, 20);
        graph.setEdgeWeight(e, 15);
        assert e.getFlow() == -5;

        graph.setEdgeWeight(e, 15);
        assert e.getFlow() == 0;

    }

}
