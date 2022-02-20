package no.noroff.rpg.exceptions;


/**
 * Exception class for taking care of exceptions related to Weapon
 */
public class InvalidWeaponException extends Exception {
    public InvalidWeaponException(String errorMessage){
        super(errorMessage);
    }
}
