package org.jgrapht;

import org.jgrapht.alg.*;
import org.jgrapht.alg.util.*;
import org.jgrapht.generate.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;
import org.jgrapht.util.*;
import org.junit.runner.*;
import org.junit.runners.*;

/**
 * Runs all unit tests of the JGraphT library.
 *
 * @author Barak Naveh
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AllGenerateTests.class, AllGraphTests.class, FlowGraphTest.class})
public final class FlowGraphTests {
}
// End AllTests.java
