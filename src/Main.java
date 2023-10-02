import java.util.Scanner;

class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your party affiliation:");
        System.out.println("D: Democrat");
        System.out.println("R: Republican");
        System.out.println("I: Independent");
        System.out.println();
        System.out.print("Enter your party affiliation (D/R/I): ");
        String party = input.nextLine();
        String response;
        switch (party) {
            case "D":
                response = "Democratic Donkey";
                break;
            case "R":
                response = "Republican Elephant";
                break;
            case "I":
                response = "Independent Person";
                break;
            default:
                response = "Other Person";
                break;
        }
        System.out.printf("You get a %s.\n", response);
    }
}
