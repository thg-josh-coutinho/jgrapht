/*
 * (C) Copyright 2006-2016, by John V Sichi and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht.alg;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.graph.*;

/**
 * .
 *
 * @author John V. Sichi
 */
public class BellmanFordShortestPathTest
    extends ShortestPathTestCase
{
    // ~ Methods ----------------------------------------------------------------

    /**
     * .
     */
    public void testConstructor()
    {
        BellmanFordShortestPath<String, DefaultWeightedEdge> path;
        Graph<String, DefaultWeightedEdge> g = create();

        path = new BellmanFordShortestPath<>(g, V3);

        // find best path with no constraint on number of hops
        assertEquals(
            Arrays.asList(new DefaultEdge[] { e13, e12, e24, e45 }), path.getPathEdgeList(V5));
        assertEquals(15.0, path.getCost(V5), 0);

        // find best path within 2 hops (less than optimal)
        path = new BellmanFordShortestPath<>(g, V3, 2);
        assertEquals(Arrays.asList(new DefaultEdge[] { e34, e45 }), path.getPathEdgeList(V5));
        assertEquals(25.0, path.getCost(V5), 0);

        // find best path within 1 hop (doesn't exist!)
        path = new BellmanFordShortestPath<>(g, V3, 1);
        assertNull(path.getPathEdgeList(V5));
        assertEquals(Double.POSITIVE_INFINITY, path.getCost(V5));
    }

    @Override
    protected List<DefaultWeightedEdge> findPathBetween(
        Graph<String, DefaultWeightedEdge> g, String src, String dest)
    {
        return BellmanFordShortestPath.findPathBetween(g, src, dest);
    }

    public void testWithNegativeEdges()
    {
        Graph<String, DefaultWeightedEdge> g = createWithBias(true);

        List<DefaultWeightedEdge> path;

        path = findPathBetween(g, V1, V4);
        assertEquals(Arrays.asList(new DefaultEdge[] { e13, e34 }), path);

        path = findPathBetween(g, V1, V5);
        assertEquals(Arrays.asList(new DefaultEdge[] { e15 }), path);
    }
}

// End BellmanFordShortestPathTest.java
