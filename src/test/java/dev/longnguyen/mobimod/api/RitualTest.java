package dev.longnguyen.mobimod.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RitualTest {
    @Test void testID1()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID2()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID3()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID4()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID5()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID6()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID7()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "iron", "iron"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID8()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"seed", "seed", "seed"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID9()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "wheat", "iron"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID10()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "seed", "iron"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID11()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID12()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"gold", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID13()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "Waseem"});

        assertTrue(nodeList[2].ritualItem.equalsIgnoreCase("Waseem"));
    }

    @Test void testID14()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(!nodeList[2].ritualItem.equalsIgnoreCase("Waseem"));
    }

    @Test void testID15()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID16()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"gold", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID17()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID18()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"seed", "seed", "seed"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

    @Test void testID19()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"iron", "iron", "iron"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("diamond"));
    }

    @Test void testID20()  {
        Ritual r = new Ritual(2);
        RitualNode[] nodeList = r.initiateRitual(new ArrayList<Integer>(Arrays.asList(
                        new Integer[] {0, 1, 2})),
                new String[] {"wheat", "wheat", "wheat"});

        assertTrue(nodeList[0].ritualItem.equalsIgnoreCase("apple"));
    }

}
