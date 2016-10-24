package org.jgrapht.graph;

import org.jgrapht.graph.ListenableDirectedWeightedGraph;
import org.jgrapht.event.*;

public class FlowGraph extends ListenableDirectedWeightedGraph<FlowGraphNode, FlowGraphEdge>
{

    public FlowGraph(){
	super(FlowGraphEdge.class);
    }

    public void addFlowGraphListener(IFlowGraphListener listener)
    {
        addToListenerList(graphListeners, listener);
    }

    @Override
    public void setEdgeWeight(FlowGraphEdge e, double weight)
    {


        if (e != null) {
	    assert (e instanceof FlowGraphEdge) : e.getClass();
	    super.setEdgeWeight(e, weight);
            fireEdgeWeightChange(e, weight);
	    ((FlowGraphEdge) e).weight = weight;
        }

    }

    protected void fireEdgeWeightChange(FlowGraphEdge edge, double weight)
    {
        FlowGraphEdgeChangeEvent e =
            createFlowGraphEdgeChangeEvent(FlowGraphEdgeChangeEvent.EDGE_WEIGHT_CHANGE, edge, (FlowGraphNode)edge.getSource(), (FlowGraphNode)edge.getTarget(), edge.getWeight(), weight);

        for (GraphListener<FlowGraphNode, FlowGraphEdge> l : graphListeners) {
	    if(l instanceof IFlowGraphListener)
		{
		    ((IFlowGraphListener)l).edgeWeightChange(e);
		}
        }
    }

    private FlowGraphEdgeChangeEvent createFlowGraphEdgeChangeEvent(int eventType, FlowGraphEdge e, FlowGraphNode source, FlowGraphNode target, double oldWeight, double newWeight)
    {
	return new FlowGraphEdgeChangeEvent(this, eventType, e, source, target, oldWeight, newWeight);
    }
    


}
