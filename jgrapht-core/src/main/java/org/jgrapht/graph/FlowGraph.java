package org.jgrapht.graph;

import org.jgrapht.graph.ListenableDirectedWeightedGraph;
import org.jgrapht.event.FlowGraphListener;

public class FlowGraph extends ListenableDirectedWeightedGraph<FlowGraphNode, FlowGraphEdge>
{

    public FlowGraph(){
	super(FlowGraphEdge.class);
    }

    public void addFlowGraphListener(FlowGraphListener listener)
    {
        addToListenerList(graphListeners, listener);
    }

    


}
