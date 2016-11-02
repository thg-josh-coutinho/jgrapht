package org.jgrapht.graph;

import java.util.*;
import org.jgrapht.graph.DefaultWeightedEdge;

public class FlowGraphEdge extends DefaultWeightedEdge
{

    public String toString()
    {
	return String.format("%s - %f - %s", getSource(), weight, getTarget());
    }


}
