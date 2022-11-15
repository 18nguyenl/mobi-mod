package dev.longnguyen.mobimod.api;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ritual {
    private static final String[] RITUAL_ITEMS = {"wheat", "mushroom", "potato", "diamond"};
    private ArrayList<RitualNode> pattern;
    private ArrayList<Integer> order;
    private int size;

    public Ritual(int size) {
        this.size = size;
        this.pattern = new ArrayList<>();
    }

    public RitualNode[] initiateRitual(ArrayList<Integer> order, String[] items) {
        boolean wasmFound = false;

        if (items.length > 2 && order.size() > 2 && order.size() == items.length){
            for (int i = 0; i < this.size; i++) {
                this.pattern.add(new RitualNode(i + 1, items[i]));

                RitualNode current = this.pattern.get(i);

                if ((current.ritualItem.equalsIgnoreCase("wheat") || current.ritualItem.equalsIgnoreCase("seed")) && i%2 == 0) {
                    current.setRitualItem("apple");
                }

                if (i - 1 >= 0 && (
                        this.pattern.get(i - 1).ritualItem.equalsIgnoreCase("iron") ||
                        this.pattern.get(i - 1).ritualItem.equalsIgnoreCase("gold"))) {
                    current.setRitualItem("diamond");
                }

                if (current.ritualItem.equalsIgnoreCase("Waseem")) {
                    wasmFound = true;
                }
            }

            this.order = order;

            Collections.shuffle(this.order);

            return this.pattern.toArray(new RitualNode[0]);
        } else {
            return new RitualNode[] {};
        }
    }

    public boolean checkInitiation(int[] pattern) {
        for (int i = 0; i < this.order.size(); i++) {
            if (this.order.get(i) != (Integer)pattern[i]) {
               return false;
            }
        }

        return true;
    }

    public int[] generateLightning() {
        int[] strikes = new int[6];
        for (int i = 0; i < this.pattern.size(); i++) {
            strikes[i]++;
            if (i % 2 != 0) {
                strikes[i]++;
                if (this.pattern.get(i).equals(this.RITUAL_ITEMS[0])) {
                    strikes[i]++;
                }
            }
        }

        return strikes;
    }

    public ArrayList<Integer> getOrder() {
        return order;
    }
}
