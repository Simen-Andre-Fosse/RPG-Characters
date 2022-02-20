package no.noroff.rpg.heroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test void createCharacter_levelIsOne_expectLevelOneAtInstantiation(){
        //Arrange
        Mage Gandalf = new Mage("Gandalf");

        //Expected value
        int expected = 1;

        //Act
        int actual = Gandalf.getLevel();

        //Assert
        assertEquals(expected, actual);
    }

    @Test void levelUp_levelIsTwo_expectHeroLevelIsTwo(){
        //Arrange
        Rogue rouge = new Rogue("Rouge1");
        int expected = 2;

        //Act
        rouge.levelUp();
        int actual = rouge.getLevel();

        //Assert
        assertEquals(expected,actual);
    }

    @Test void initializedHero_MageHasDefaultAttributes_defaultAttributesAtLevel1(){
        //Arrange
        Mage gandalf = new Mage("Gandalf");
        int[] expected = {1,1,8};

        //Act
        int[] actual = {gandalf.getBaseAtt().getStrength(),
                gandalf.getBaseAtt().getDexterity(),
                gandalf.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }

    @Test void initializedHero_RangerHasDefaultAttributes_defaultAttributesAtLevel1(){
        //Arrange
        Ranger ranger = new Ranger("Ranger1");
        int[] expected = {1,7,1};

        //Act
        int[] actual = {ranger.getBaseAtt().getStrength(),
                ranger.getBaseAtt().getDexterity(),
                ranger.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }

    @Test void initializedHero_RougeHasDefaultAttributes_defaultAttributesAtLevel1(){
        //Arrange
        Rogue rouge = new Rogue("Rouge1");
        int[] expected = {2,6,1};

        //Act
        int[] actual = {rouge.getBaseAtt().getStrength(),
                rouge.getBaseAtt().getDexterity(),
                rouge.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }

    @Test void initializedHero_WarriorHasDefaultAttributes_defaultAttributesAtLevel1(){
        //Arrange
        Warrior warrior = new Warrior("Warrior1");
        int[] expected = {5,2,1};

        //Act
        int[] actual = {warrior.getBaseAtt().getStrength(),
                warrior.getBaseAtt().getDexterity(),
                warrior.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }


    @Test void levelUp_MageAttributesIncreasedWhenLeveledUp_ExpectedAttributesLeveledUp(){
        //Arrange
        Mage mage = new Mage("Gandalf");
        mage.levelUp();

        int[] expected = {2,2,13};

        //Act
        int[] actual = {mage.getBaseAtt().getStrength(),
                mage.getBaseAtt().getDexterity(),
                mage.getBaseAtt().getIntelligence()};

        assertArrayEquals(expected,actual);
    }

    @Test void levelUp_RangerAttributesIncreasedWhenLeveledUp_ExpectedAttributesLeveledUp(){
        //Arrange
        Ranger ranger = new Ranger("Ranger1");
        ranger.levelUp();
        int[] expected = {2,12,2};

        //Act
        int[] actual = {ranger.getBaseAtt().getStrength(),
                ranger.getBaseAtt().getDexterity(),
                ranger.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }


    @Test void levelUp_RougeAttributesIncreasedWhenLeveledUp_ExpectedAttributesLeveledUp(){
        //Arrange
        Rogue rouge = new Rogue("Rouge1");
        rouge.levelUp();
        int[] expected = {3,10,2};

        //Act
        int[] actual = {rouge.getBaseAtt().getStrength(),
                rouge.getBaseAtt().getDexterity(),
                rouge.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }


    @Test void levelUp_WarriorAttributesIncreasedWhenLeveledUp_ExpectedAttributesLeveledUp(){
        //Arrange
        Warrior warrior = new Warrior("Warrior1");
        warrior.levelUp();
        int[] expected = {8,4,2};

        //Act
        int[] actual = {warrior.getBaseAtt().getStrength(),
                warrior.getBaseAtt().getDexterity(),
                warrior.getBaseAtt().getIntelligence()};

        //Assert
        assertArrayEquals(expected,actual);
    }





}