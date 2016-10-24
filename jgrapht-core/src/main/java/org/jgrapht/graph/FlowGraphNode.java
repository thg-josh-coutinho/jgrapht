package org.jgrapht.graph;

public class FlowGraphNode
{

    private String id;

    public FlowGraphNode(String s) { id = s; }

    public String getId() { return id; }

    public boolean equals(Object node) { return id.equals(((FlowGraphNode)node).getId()); }

    public int hashCode() { return id.hashCode(); }

    public String toString() { return id; }

}
