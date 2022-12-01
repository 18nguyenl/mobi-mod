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
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
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
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T3() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M3(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T3:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T4() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M4(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T4:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T5() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M5(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T5:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T6() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M6(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T6:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T7() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M7(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T7:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T8() {
        int ritualSize = 4;
        Integer[] order = new Integer[]{0, 1, 2, 3};
        String[] pattern = new String[]{"iron", "iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M8(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T8:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T9() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M9(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T9:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T10() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M10(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T10:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T11() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M11(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T11:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T12() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M12(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T12:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T13() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M13(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T13:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T14() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M14(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T14:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T15() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M15(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T15:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T16() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "iron", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M16(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T16:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T17() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "gold", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M17(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T17:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T18() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"iron", "gold", "iron"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            mutated.M18(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        });

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
//        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T18:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + exception.getMessage());
        assertNotEquals(Arrays.toString(originalRitualItems), exception.getMessage());
    }

    @Test
    void T19() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M19(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T19:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }

    @Test
    void T20() {
        int ritualSize = 3;
        Integer[] order = new Integer[]{0, 1, 2};
        String[] pattern = new String[]{"wheat", "wheat", "wheat"};

        Ritual original = new Ritual(ritualSize);
        Ritual mutated = new Ritual(ritualSize);

        RitualNode[] originalNodeList = original.initiateRitual(new ArrayList<Integer>(Arrays.asList(order)), pattern);
        RitualNode[] mutatedNodeList = mutated.M20(new ArrayList<Integer>(Arrays.asList(order)), pattern);

        String[] originalRitualItems = Stream.of(originalNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);
        String[] mutatedRitualItems = Stream.of(mutatedNodeList).map(ritualNode -> ritualNode.ritualItem).toArray(String[]::new);

        System.out.println("T20:");
        System.out.println(Arrays.toString(originalRitualItems) + " " + Arrays.toString(mutatedRitualItems));
        assertNotEquals(Arrays.toString(originalRitualItems), Arrays.toString(mutatedRitualItems));
    }
}
