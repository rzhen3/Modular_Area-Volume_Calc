
package modular.and.inheritance.assignment;

import java.util.Scanner;

/**
 *
 * @author Roy Zheng
 */
public class mainProgram{
    static boolean continuePlaying = true;
    static Scanner scan = new Scanner(System.in);
    final static String instructions = "\t\t\tVolume and Surface Area Calculator:\n"
                + "-------------------------------------------------------------------------------------------\n"
                + "This is a volume and surface area calculator for basic shapes.\n"
                + "You will input the shape for which you desire the volume and surface area.\n"
                + "Next, you can input the relevant specifications of the face you want.\n"
                + "Note for polygons with more than 4 sides, a regular polygon will be assumed\n"
                + "Once that information has been gathered, you can choose to output the surface area or the volume\n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       runProgram();
       System.out.println("Goodbye!");
    }
    //Line break method
    private static void printLB(){
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    //Method that gets user shape (may be removed)
    public static String getUserShape(){
        System.out.println("List of possible shapes: \n"
                    + "-prism\n"
                    + "-pyramid\n"
                    + "-sphere\n"
                    + "-cone\n"
                    + "-cylinder\n"
                    + "-torus\n"
                + "To quit, type in anything else.\n"
                    + "Enter your desired shape name(excluding the \"-\")");
         return scan.next().replaceAll(" ","");
    }
    //Main run program method
    public static void runProgram(){
        do{
            System.out.println(instructions);
            String userInput = getUserShape();
            printLB();
            //Determining what shape to create
            switch(userInput){
                case "prism":
                    doActions(new Prism());
                    break;
                case "pyramid":
                    doActions(new Pyramid());
                    break;
                case "sphere":
                    doActions(new Sphere());
                    break;
                case "cone":
                    doActions(new Cone());
                    break;
                case "cylinder":
                    doActions(new Cylinder());
                    break;
                case "torus":
                    doActions(new Torus());
                    break;
                default:
                    continuePlaying = false;
                    break;
            }
        }while(continuePlaying == true);
        
    }
    
    
    //Creating a program that executes actions for each shape
    
    //Overload for prism
    public static void doActions(Prism uPrism){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            //Different options
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uPrism.getSurfaceArea(uPrism.prismFace, uPrism.height));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uPrism.getVolume(uPrism.prismFace, uPrism.height));
            else if(userInput.equalsIgnoreCase("change"))
                uPrism = new Prism();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
    //OVerload for pyramid
    public static void doActions(Pyramid uPyramid){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uPyramid.getSurfaceArea(uPyramid.prismFace, uPyramid.height));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uPyramid.getVolume(uPyramid.prismFace, uPyramid.height));
            else if(userInput.equalsIgnoreCase("change"))
                uPyramid = new Pyramid();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
    //Overload for sphere
    public static void doActions(Sphere uSphere){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uSphere.getSurfaceArea(uSphere.radius));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uSphere.getVolume(uSphere.radius));
            else if(userInput.equalsIgnoreCase("change"))
                uSphere = new Sphere();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
    //Overload for cone
    public static void doActions(Cone uCone){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uCone.getSurfaceArea(uCone.radius, uCone.height));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uCone.getVolume(uCone.radius, uCone.height));
            else if(userInput.equalsIgnoreCase("change"))
                uCone = new Cone();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
    //Overload for cylinder
    public static void doActions(Cylinder uCylinder){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uCylinder.getSurfaceArea(uCylinder.radius, uCylinder.height));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uCylinder.getVolume(uCylinder.radius, uCylinder.height));
            else if(userInput.equalsIgnoreCase("change"))
                uCylinder = new Cylinder();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
    //Overload for torus
    public static void doActions(Torus uTorus){
        String userInput;
        scan.nextLine();
        do{
            System.out.println("To get surface area, type \'surface area\'\n"
                    + "To get volume, type \'volume\'\n"
                    + "To change specifications, type \'change\'\n"
                    + "When finished, type \'finished\'\n"
                    + "Enter below:");
            userInput = scan.nextLine();
            printLB();
            if(userInput.equalsIgnoreCase("surface area"))
                System.out.println("Surface Area: "+uTorus.getSurfaceArea(uTorus.radius, uTorus.secondR));
            else if(userInput.equalsIgnoreCase("volume"))
                System.out.println("Volume: "+uTorus.getVolume(uTorus.radius, uTorus.secondR));
            else if(userInput.equalsIgnoreCase("change"))
                uTorus = new Torus();
            else if(userInput.equalsIgnoreCase("finished"))
                break;
            else
                System.out.println("Command misunderstood. Try again");
            
        }while(true);
    }
}

