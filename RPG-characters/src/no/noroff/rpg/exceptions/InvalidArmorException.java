package no.noroff.rpg.exceptions;


/**
 * Exception class for taking care of exceptions related to Armor.
 */
public class InvalidArmorException extends Exception{
    public InvalidArmorException(String errorMessage){
        super(errorMessage);
    }
}