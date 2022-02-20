package no.noroff.rpg.display;

import no.noroff.rpg.heroes.Hero;

/**
 * Class for displaying the stats of a Hero.
 */
public class CharacterStatsDisplay {

    /**
     * The static method for displaying a hero
     * @param hero, the hero
     * @return stats
     */
    public static StringBuilder statsDisplay(Hero hero){
        StringBuilder stats = new StringBuilder();
        stats.append("Hero stats: \n")
                .append("Hero name is: ").append(hero.getName()).append("\n")
                .append("Character level: ").append(hero.getLevel()).append("\n")
                .append("Character strength: ").append(hero.getTotalATT().getStrength()).append("\n")
                .append("Character dexterity: ").append(hero.getTotalATT().getDexterity()).append("\n")
                .append("Character intelligence: ").append(hero.getTotalATT().getIntelligence()).append("\n")
                .append("Character DPS : ").append(hero.getDPS()).append("\n");

        return stats;
    }
}
