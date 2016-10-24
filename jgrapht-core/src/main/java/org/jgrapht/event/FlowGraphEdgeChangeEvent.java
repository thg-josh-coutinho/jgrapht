package org.jgrapht.event;

import org.jgrapht.graph.FlowGraphEdge;
import org.jgrapht.graph.FlowGraphNode;

public class FlowGraphEdgeChangeEvent extends GraphEdgeChangeEvent<FlowGraphNode, FlowGraphEdge> {

    public static final int EDGE_WEIGHT_CHANGE = 25;
    private double oldWeight;
    private double newWeight;


    public FlowGraphEdgeChangeEvent(Object eventSource, int type, FlowGraphEdge edge, FlowGraphNode edgeSource, FlowGraphNode edgeTarget, double oldWeight, double newWeight)
    {
        super(eventSource, type, edge, edgeSource, edgeTarget);
	this.oldWeight = oldWeight;
	this.newWeight = newWeight;
    }
 
}
