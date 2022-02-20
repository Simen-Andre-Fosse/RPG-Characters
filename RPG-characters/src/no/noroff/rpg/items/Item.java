package no.noroff.rpg.items;

public abstract class Item {
    protected String name;
    protected int requiredLevel;
    protected SlotSpot slot;

    public Item(String name, int requiredLevel, SlotSpot slot){
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public SlotSpot getSlot() {
        return slot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public void setSlot(SlotSpot slot) {
        this.slot = slot;
    }
}
