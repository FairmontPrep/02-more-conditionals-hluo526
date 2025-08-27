/** READ FIRST
 * You are writing a program to help a school decide whether a student 
 * qualifies for the Honor Roll, Merit List, or No List based on their 
 * grades and behavior record. The method you will be completing will 
 * have the following parameters:
 *      GPA (a number between 0.0 and 4.0)
 *      Number of tardies (integer)
 *      Number of detentions (integer)
 * 
 * Apply the following rules:
 *      If GPA is 3.5 or higher and the student has no detentions, they 
 *      may qualify for the Honor Roll.
 *      But, if they also have fewer than 3 tardies, they are officially 
 *      placed on the Honor Roll.
 *      Otherwise, they are only eligible for the Merit List.
 * 
 *      If GPA is between 2.5 and 3.49 (inclusive) and they have fewer 
 *      than 2 detentions, they qualify for the Merit List.
 *      Otherwise, they are placed on No List.
 * 
 * Return the correct message:
 *      "Honor Roll"
 *      "Merit List"
 *      "No List"
 */

public class HonorRoll {
    public static void main(String[] args) {
        // Sample test cases (you can add more if needed)
        double[] gpas =       {4.0, 3.6, 3.5, 3.4};
        int[] tardies =       {2,   3,   1,   0};
        int[] detentions =    {0,   0,   1,   1};
        String[] expects = {
            "Honor Roll",
            "Merit List",
            "No List",
            "Merit List"
        };

        for (int i = 0; i < gpas.length; i++) {
            String received = HonorRoll.awardQualifier(gpas[i], tardies[i], detentions[i]);
            System.out.println("Test " + (i + 1));
            System.out.println("  GPA: " + gpas[i] + ", Tardies: " + tardies[i] + ", Detentions: " + detentions[i]);
            System.out.println("  Expected: " + expects[i]);
            System.out.println("  Received: " + received);
            System.out.println();
        }        
    }

    /** COMPLETE THIS METHOD
     * If GPA is 3.5 or higher and the student has no detentions, they 
     * may qualify for the Honor Roll.
     * But, if they also have fewer than 3 tardies, they are officially 
     * placed on the Honor Roll.
     * Otherwise, they are only eligible for the Merit List.
     * 
     * If GPA is between 2.5 and 3.4.9 (inclusive) and they have fewer 
     * than 2 detentions, they qualify for the Merit List.
     * Otherwise, they are placed on No List.
     * 
     * Return the correct message: "Honor Roll", "Merit List", or "No List"
     * 
     * @param gpa GPA of student
     * @param detentions Number of dententions student has
     * @param tardies Number of tardies student has
     * @return String of award given
     */
    public static String awardQualifier(double gpa, int tardies, int detentions) {
        // Insert your code below
        if (gpa >= 3.5 && detentions == 0) {
            if (tardies < 3) {
                return "Honor Roll";
            } else {
                return "Merit List";
            }
        } else if (gpa >= 2.5 && gpa <= 3.49 && detentions < 2) {
            return "Merit List";
        }
        return "No List";
    }
}
