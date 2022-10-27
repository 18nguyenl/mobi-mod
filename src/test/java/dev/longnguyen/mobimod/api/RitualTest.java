package dev.longnguyen.mobimod.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RitualTest {
    @Test void testID1()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 1})), new String[] {"wheat", "wheat"});
        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID2() {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 1})), new String[] {"wheat", "wheat"});
        assertTrue(nodeList[1].ritualItem.equalsIgnoreCase("seed"));
    }

    @Test void testID3() {
        Ritual r = new Ritual(1);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1})), new String[] {"diamond"});
        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("iron"));
    }

    @Test void testID4() {
        Ritual r = new Ritual(1);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1})), new String[] {"diamond"});
        assertEquals(false, r.checkInitiation(new int[]{0}));
    }

    @Test void testID5() {
        Ritual r = new Ritual(0);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {})), new String[] {});
        assertEquals(true, r.checkInitiation(new int[]{}));
    }

    @Test void testID6() {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2})), new String[] {"wheat", "diamond"});
        assertEquals(true, r.checkInitiation(new int[]{1,2}));
    }

    @Test void testID7() {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(new Integer[] {1,3})), new String[] {"wheat", "diamond"});
        assertEquals(false, r.checkInitiation(new int[]{1,4}));
    }
}
