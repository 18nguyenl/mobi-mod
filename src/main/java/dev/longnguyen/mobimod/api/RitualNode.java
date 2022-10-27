package dev.longnguyen.mobimod.api;

public class RitualNode {
    int ID;
    String ritualItem;

    public RitualNode(int ID, String ritualItem) {
       this.ID = ID;
       this.ritualItem = ritualItem;
    }

    public void setRitualItem(String ritualItem) {
        this.ritualItem = ritualItem;
    }
}
