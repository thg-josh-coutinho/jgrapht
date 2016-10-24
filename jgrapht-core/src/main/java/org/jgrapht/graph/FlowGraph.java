package org.jgrapht.graph;

import org.jgrapht.graph.ListenableDirectedWeightedGraph;

public class FlowGraph extends ListenableDirectedWeightedGraph<FlowGraphNode, FlowGraphEdge>
{

    public void addFlowGraphListener(FlowGraphListener listener)
    {
        addToListenerList(graphListeners, listener);
    }

    


}
