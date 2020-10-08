/*
Matthias Kim
Lab 4.6
11/21/19
Extra: gave the ability to rerun the program after completion
 */

import java.util.Scanner;

public class lab46 {
    public static void simulator(){
        int response, characteristic, altNum = 0;
        String nou, type = "", alteration = "";
        Scanner input = new Scanner (System.in);

        System.out.println("Which aircraft will be simulated?\n\t1. Blimp\n\t2.Helicopter\n\t3. Fighter Jet\n\t4. Space Shuttle");
            response = input.nextInt();
            //switch for response to determine the type of simulation
            switch (response) {
                case 1: {
                    type = "Blimp";
                    System.out.println("You chose to simulate the blimp! Would you like to change the characteristics? ('yes' or 'no')");
                    System.out.println("\t1.Position Trim\n\t2.Force Breakout\n\t3.Force Gradient\n\t4.Force Friction\n\t5.Damping\n\t6.Hard Stop");

                    nou = input.next();
                    while (nou.equalsIgnoreCase("yes")) {
                        System.out.println("Enter number of the changed characteristic.");
                        characteristic = input.nextInt();

                        if (characteristic == 1) {
                            System.out.println("The position to which a flight control returns when the pilot releases it");
                            System.out.println("Would you like to change another thing? ('yes' or 'no')");
                            nou = input.next();
                            ++altNum;
                            alteration = alteration + "  Position Trim";

                        } else if (characteristic == 2) {
                            System.out.println("A force that returns a control to Trim. This is a constant force applied toward Trim which remains the same despite how far the control is moved (displacement) and how fast a control is moved (velocity).");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Breakout";
                            ++altNum;

                        } else if (characteristic == 3) {
                            System.out.println("A force that returns a control to Trim, but one that varies with displacement. The farther the control is moved, the stronger the force applied toward Trim.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Gradient";
                            ++altNum;
                        } else if (characteristic == 4) {
                            System.out.println("A constant force that is opposite to the direction of movement.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Friction";
                            ++altNum;
                        } else if (characteristic == 5) {
                            System.out.println("A force that is opposite to the direction of movement. Damping varies with velocity. The faster a control is moved, the stronger the force.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Damping";
                            ++altNum;
                        } else if (characteristic == 6) {
                            System.out.println("A force that simulates a mechanical limit of travel. By varying the Hard Stops, the range of travel can be adjusted.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Hard Stop";
                            ++altNum;
                        }
                        else {
                            System.out.println("Invalid choice type.");
                            System.out.println("Enter the number of the characteristic you'd like to change.");
                            nou = input.next();
                        }
                    }
                    break;
                }
                case 2: {
                    type = "Helicopter";
                    System.out.println("You chose to simulate the helicopter! Would you like to change the characteristics? ('yes' or 'no')");
                    System.out.println("\t1.Position Trim\n\t2.Force Breakout\n\t3.Force Gradient\n\t4.Force Friction\n\t5.Damping\n\t6.Hard Stop");

                    nou = input.next();

                    while (nou.equalsIgnoreCase("yes")) {
                        System.out.println("Enter number of the changed characteristic.");
                        characteristic = input.nextInt();

                        if (characteristic == 1) {
                            System.out.println("The position to which a flight control returns when the pilot releases it");
                            System.out.println("Would you like to change another thing? ('yes' or 'no')");
                            nou = input.next();
                            ++altNum;
                            alteration = alteration + "  Position Trim";

                        } else if (characteristic == 2) {
                            System.out.println("A force that returns a control to Trim. This is a constant force applied toward Trim which remains the same despite how far the control is moved (displacement) and how fast a control is moved (velocity).");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Breakout";
                            ++altNum;

                        } else if (characteristic == 3) {
                            System.out.println("A force that returns a control to Trim, but one that varies with displacement. The farther the control is moved, the stronger the force applied toward Trim.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Gradient";
                            ++altNum;
                        } else if (characteristic == 4) {
                            System.out.println("A constant force that is opposite to the direction of movement.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Friction";
                            ++altNum;
                        } else if (characteristic == 5) {
                            System.out.println("A force that is opposite to the direction of movement. Damping varies with velocity. The faster a control is moved, the stronger the force.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Damping";
                            ++altNum;
                        } else if (characteristic == 6) {
                            System.out.println("A force that simulates a mechanical limit of travel. By varying the Hard Stops, the range of travel can be adjusted.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Hard Stop";
                            ++altNum;
                        }
                        else {
                            System.out.println("Invalid choice type.");
                            System.out.println("Enter the number of the characteristic you'd like to change.");
                            nou = input.next();
                        }
                    }
                    break;
                }
                case 3: {
                    type = "Fighter Jet";
                    System.out.println("You chose to simulate the fighter jet! Would you like to change the characteristics? ('yes' or 'no')");
                    System.out.println("\t1.Position Trim\n\t2.Force Breakout\n\t3.Force Gradient\n\t4.Force Friction\n\t5.Damping\n\t6.Hard Stop");
                    nou = input.next();

                    while (nou.equalsIgnoreCase("yes")) {
                        System.out.println("Enter number of the changed characteristic.");
                        characteristic = input.nextInt();

                        if (characteristic == 1) {
                            System.out.println("The position to which a flight control returns when the pilot releases it");
                            System.out.println("Would you like to change another thing? ('yes' or 'no')");
                            nou = input.next();
                            ++altNum;
                            alteration = alteration + "  Position Trim";

                        } else if (characteristic == 2) {
                            System.out.println("A force that returns a control to Trim. This is a constant force applied toward Trim which remains the same despite how far the control is moved (displacement) and how fast a control is moved (velocity).");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Breakout";
                            ++altNum;

                        } else if (characteristic == 3) {
                            System.out.println("A force that returns a control to Trim, but one that varies with displacement. The farther the control is moved, the stronger the force applied toward Trim.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Gradient";
                            ++altNum;
                        } else if (characteristic == 4) {
                            System.out.println("A constant force that is opposite to the direction of movement.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Friction";
                            ++altNum;
                        } else if (characteristic == 5) {
                            System.out.println("A force that is opposite to the direction of movement. Damping varies with velocity. The faster a control is moved, the stronger the force.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Damping";
                            ++altNum;
                        } else if (characteristic == 6) {
                            System.out.println("A force that simulates a mechanical limit of travel. By varying the Hard Stops, the range of travel can be adjusted.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Hard Stop";
                            ++altNum;
                        }
                        else {
                            System.out.println("Invalid choice type.");
                            System.out.println("Enter the number of the characteristic you'd like to change.");
                            nou = input.next();
                        }
                    }
                    break;
                }
                case 4: {
                    type = "Space Shuttle";
                    System.out.println("You chose to simulate the space shuttle! Would you like to change the characteristics? ('yes' or 'no')");
                    System.out.println("\t1.Position Trim\n\t2.Force Breakout\n\t3.Force Gradient\n\t4.Force Friction\n\t5.Damping\n\t6.Hard Stop");

                    nou = input.next();

                    while (nou.equalsIgnoreCase("yes")) {
                        System.out.println("Enter number of the changed characteristic.");
                        characteristic = input.nextInt();

                        if (characteristic == 1) {
                            System.out.println("The position to which a flight control returns when the pilot releases it");
                            System.out.println("Would you like to change another thing? ('yes' or 'no')");
                            nou = input.next();
                            ++altNum;
                            alteration = alteration + "  Position Trim";

                        } else if (characteristic == 2) {
                            System.out.println("A force that returns a control to Trim. This is a constant force applied toward Trim which remains the same despite how far the control is moved (displacement) and how fast a control is moved (velocity).");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Breakout";
                            ++altNum;

                        } else if (characteristic == 3) {
                            System.out.println("A force that returns a control to Trim, but one that varies with displacement. The farther the control is moved, the stronger the force applied toward Trim.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Gradient";
                            ++altNum;
                        } else if (characteristic == 4) {
                            System.out.println("A constant force that is opposite to the direction of movement.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Force Friction";
                            ++altNum;
                        } else if (characteristic == 5) {
                            System.out.println("A force that is opposite to the direction of movement. Damping varies with velocity. The faster a control is moved, the stronger the force.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Damping";
                            ++altNum;
                        } else if (characteristic == 6) {
                            System.out.println("A force that simulates a mechanical limit of travel. By varying the Hard Stops, the range of travel can be adjusted.");
                            System.out.println("Would you like to change something else? ('yes' or 'no')");
                            nou = input.next();
                            alteration = alteration + "  Hard Stop";
                            ++altNum;
                        }
                        else {
                            System.out.println("Invalid choice type.");
                            System.out.println("Enter the number of the characteristic you'd like to change.");
                            nou = input.next();
                        }
                    }
                     // end while
                            break;
                        } // end case for 4
                        default: {
                            System.out.println("You did not choose a viable option.");
                            break;
                        } // end default
        } // end switch

                            System.out.println("Your Simulated Aircraft: " + type);
                            System.out.println("Number of Alterations: " + altNum);
                            System.out.println("Alterations Made: " + alteration);

    } // end static

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String rerun;

        simulator();

        System.out.println("Would you like to simulate a new aircraft and rerun the program? ('yes' or 'no')");
        rerun = in.next();

        while (rerun.equalsIgnoreCase("yes")) {
            simulator();
        }
        System.out.println("Thank you for your time!");

    }

} //end class
