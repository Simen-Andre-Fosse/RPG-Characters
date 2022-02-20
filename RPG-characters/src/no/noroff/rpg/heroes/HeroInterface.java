package no.noroff.rpg.heroes;

import no.noroff.rpg.items.Item;

/**
 * Interface for Hero.
 */
public interface HeroInterface {
    void levelUp();
    void equip(Item item) throws Exception;
}
