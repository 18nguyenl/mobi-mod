package dev.longnguyen.mobimod.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class RitualTest {
    @Test
    void T1() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T2() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M2(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T2:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T3() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M3(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T3:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T4() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T5() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T6() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T7() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T8() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T9() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T10() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T11() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T12() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T13() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T14() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T15() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T16() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T17() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T18() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T19() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T20() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M1(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T1:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }
}
