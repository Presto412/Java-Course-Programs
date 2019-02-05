package lab;

import java.util.*;

class ChemicalEquation {

    static int printAndReturnNumberOfMolecules(String molecule) {
        char firstCharacter = molecule.charAt(0);
        if (Character.isDigit(firstCharacter)) {
            System.out.println(firstCharacter + " molecules of " + molecule.substring(1));
            return Character.getNumericValue(firstCharacter);
        }
        System.out.println("1 molecule of " + molecule);
        return 1;
    }

    public static void main(String[] args) {
        String equation;
        int reactantCount = 0, productCount = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the chemical equation:");
        equation = in.nextLine();
        in.close();

        String[] equations;
        equations = equation.split("->");
        String leftMolecules[], rightMolecules[];
        leftMolecules = equations[0].split("\\+");
        rightMolecules = equations[1].split("\\+");

        System.out.println(
                "Number of Reactants:" + leftMolecules.length + ", Number of Products:" + rightMolecules.length);

        System.out.println("Reactants include:");
        for (String molecule : leftMolecules) {
            reactantCount += printAndReturnNumberOfMolecules(molecule.trim());
        }

        System.out.println("Products include:");
        for (String molecule : rightMolecules) {
            productCount += printAndReturnNumberOfMolecules(molecule.trim());
        }

        System.out.println("Total Number of Reactant Molecules:" + reactantCount
                + ", Total Number of Product Molecules:" + productCount);
    }
}
