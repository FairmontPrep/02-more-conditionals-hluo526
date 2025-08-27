/** READ FIRST
 * You have been hired by a theme park to write a program that checks 
 * whether a visitor is eligible to go on certain rides. The eligibility 
 * depends on the visitor's age, height, and special conditions like 
 * having a VIP pass, a parent/guardian, or a younger sibling.
 * 
 * Ride Rules
 * 
 * Extreme Coaster:
 *      Must be at least 16 years old AND at least 60 inches tall.
 *      If the person has a VIP pass, they may ride if they are at least 
 *      14 years old AND at least 55 inches tall.
 * 
 * Family River Ride:
 *      Must be at least 8 years old AND at least 40 inches tall.
 *      If younger than 8, they may still ride if they are with a parent/guardian.
 * 
 * Kiddie Carousel:
 *      Available to everyone under 12 years old.
 *      If 12 or older, they can still ride only if they are with a younger 
 *      sibling.
 */

public class ThemePark {
    public static void main(String[] args) {
        // Test cases for Extreme Coaster
        System.out.println("Extreme Coaster Tests:");
        System.out.println("16 years, 62 inches, no VIP: " + canRideExtremeCoaster(16, 62, false));  // true
        System.out.println("14 years, 56 inches, with VIP: " + canRideExtremeCoaster(14, 56, true)); // true
        System.out.println("14 years, 62 inches, no VIP: " + canRideExtremeCoaster(14, 62, false));  // false
        
        // Test cases for Family River
        System.out.println("\nFamily River Tests:");
        System.out.println("9 years, 42 inches, no parent: " + canRideFamilyRiver(9, 42, false));    // true
        System.out.println("7 years, 42 inches, with parent: " + canRideFamilyRiver(7, 42, true));   // true
        System.out.println("7 years, 42 inches, no parent: " + canRideFamilyRiver(7, 42, false));    // false
        
        // Test cases for Kiddie Carousel
        System.out.println("\nKiddie Carousel Tests:");
        System.out.println("11 years, no sibling: " + canRideKiddieCarousel(11, false));             // true
        System.out.println("13 years, with sibling: " + canRideKiddieCarousel(13, true));            // true
        System.out.println("13 years, no sibling: " + canRideKiddieCarousel(13, false));             // false
    }

    /** COMPLETE THIS METHOD
     * Rules:
     *  Age requirement is 16+ and height requirement is 60+ inches.
     *  With VIP: Age requirment is 14+ and height requirement is 55+ inches.
     * 
     * @param age Age of person
     * @param height Height of person
     * @param hasVIP If person is VIP
     * @return Return true if person can go on ride
     */
    public static boolean canRideExtremeCoaster(int age, double height, boolean hasVIP) {
        // Insert your code below
        if (hasVIP) {
            return age >= 14 && height >= 55;
        } else {
            return age >= 16 && height >= 60;
        }
    }

    /** COMPLETE THIS METHOD
     * Rules:
     * Age requirement is 8+ and height requirement is 40+ inches.
     * If under 8, parent must be present.
     * 
     * @param age Age of person
     * @param height Height of person
     * @param withParent Is person with a parent?
     * @return Returns true if person can go on ride
     */
    public static boolean canRideFamilyRiver(int age, double height, boolean withParent) {
        // Insert your code below
        if (height < 40) {
            return false;
        }
        if (age >= 8) {
            return true;
        }
        return withParent;
    }

    /** COMPLETE THIS METHOD
     * Rules:
     *  Age requirment is under 12 years old.
     *  If age is 12 or older, can only ride if with sibling under 12.
     * 
     * @param age Age of person
     * @param withSiblingUnder12 Check if person is with sibling under 12
     * @return Returns true if person can go on ride
     */
    public static boolean canRideKiddieCarousel(int age, boolean withSiblingUnder12) {
        // Insert your code below
        if (age < 12) {
            return true;
        }
        return withSiblingUnder12;
    }
}
