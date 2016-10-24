package org.jgrapht.graph;

import org.jgrapht.graph.ListenableDirectedWeightedGraph;
import org.jgrapht.event.IFlowGraphListener;

public class FlowGraph extends ListenableDirectedWeightedGraph<FlowGraphNode, FlowGraphEdge>
{

    public FlowGraph(){
	super(FlowGraphEdge.class);
    }

    public void addFlowGraphListener(IFlowGraphListener listener)
    {
        addToListenerList(graphListeners, listener);
    }

    


}
