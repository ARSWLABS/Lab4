package edu.eci.arsw.blueprints.test.persistence.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.eci.arsw.blueprints.filter.impl.RedundancyFilter;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;

public class RedundancyFilterTest {

    private RedundancyFilter filter;

    @Before
    public void setUp() {
        filter = new RedundancyFilter();
    }

    @Test
    public void testRedundancyFilter() {
        Point[] points = new Point[]{new Point(10, 10), new Point(10, 10), new Point(20, 20), new Point(20, 20)};
        Blueprint bp = new Blueprint("author1", "bp1", points);
        Blueprint filteredBp = filter.filter(bp);

        assertEquals(2, filteredBp.getPoints().size());
        assertEquals(new Point(10, 10), filteredBp.getPoints().get(0));
        assertEquals(new Point(20, 20), filteredBp.getPoints().get(1));
    }
}