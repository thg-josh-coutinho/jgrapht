package org.jgrapht.event;

import org.jgrapht.graph.FlowGraphEdge;
import org.jgrapht.graph.FlowGraphNode;

public class FlowGraphEdgeChangeEvent extends GraphEdgeChangeEvent<FlowGraphNode, FlowGraphEdge> {

    public FlowGraphEdgeChangeEvent(Object eventSource, int type, FlowGraphEdge edge, FlowGraphNode edgeSource, FlowGraphNode edgeTarget)
    {
        super(eventSource, type, edge, edgeSource, edgeTarget);
    }
 
}
