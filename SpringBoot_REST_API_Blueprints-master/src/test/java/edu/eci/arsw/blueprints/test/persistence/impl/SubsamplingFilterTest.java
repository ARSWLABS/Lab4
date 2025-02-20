package edu.eci.arsw.blueprints.test.persistence.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.eci.arsw.blueprints.filter.impl.SubsamplingFilter;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;

public class SubsamplingFilterTest {

    private SubsamplingFilter filter;

    @Before
    public void setUp() {
        filter = new SubsamplingFilter();
    }

    @Test
    public void testSubsamplingFilter() {
        Point[] points = new Point[]{new Point(10, 10), new Point(20, 20), new Point(30, 30), new Point(40, 40)};
        Blueprint bp = new Blueprint("author1", "bp1", points);
        Blueprint filteredBp = filter.filter(bp);

        assertEquals(2, filteredBp.getPoints().size());
        assertEquals(new Point(10, 10), filteredBp.getPoints().get(0));
        assertEquals(new Point(30, 30), filteredBp.getPoints().get(1));
    }
}