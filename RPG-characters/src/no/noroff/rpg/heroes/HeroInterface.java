package no.noroff.rpg.heroes;

import no.noroff.rpg.items.Item;

public interface HeroInterface {
    void levelUp();
    void equip(Item item) throws Exception;
}
