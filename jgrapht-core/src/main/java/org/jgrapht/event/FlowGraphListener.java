package org.jgrapht.event;

import org.jgrapht.event.*;

public interface FlowGraphListener<V, E> extends GraphListener<V, E> {
    
    public void edgeWeightChange(FlowGraphEdgeChangeEvent e);

}
