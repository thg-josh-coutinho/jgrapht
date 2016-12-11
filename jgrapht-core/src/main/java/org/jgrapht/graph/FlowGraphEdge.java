package org.jgrapht.graph;

import java.util.*;
import org.jgrapht.graph.DefaultWeightedEdge;

public class FlowGraphEdge extends DefaultWeightedEdge
{

    double flow;

    public void updateFlow(double previousWeight, double newWeight) { flow += newWeight - previousWeight; }


    public String toString()
    {
	return String.format("%s - %f - %s", getSource(), weight, getTarget());
    }

    public double getFlow() { return flow; }

    public void resetFlow() { flow = 0; }


}
