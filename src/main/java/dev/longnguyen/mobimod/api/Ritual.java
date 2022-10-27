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
        for (int i = 0; i < this.size; i++) {
           this.pattern.add(new RitualNode(i + 1, items[i]));

           RitualNode current = this.pattern.get(i);

           if (current.ritualItem.equalsIgnoreCase("wheat")) {
               if (i % 2 == 0) {
                   current.setRitualItem("apple");
               } else {
                   current.setRitualItem("seed");
               }
           } else if (current.ritualItem.equalsIgnoreCase("diamond")) {
               current.setRitualItem("iron");
           }
        }

        this.order = order;

        Collections.shuffle(this.order);

       return this.pattern.toArray(new RitualNode[0]);
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
