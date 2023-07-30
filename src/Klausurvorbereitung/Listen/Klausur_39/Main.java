package Klausurvorbereitung.Listen.Klausur_39;

public class Main {
    public static void main(String[] args) {
        // Create a new Prioritaetsliste
        Prioritaetsliste liste = new Prioritaetsliste();

        // Add some actions with priorities to the list
        liste.einfuegen("Action1", 3);
        liste.einfuegen("Action2", 1);
        liste.einfuegen("Action3", 5);
        liste.einfuegen("Action4", 2);

        // Find and print the action with highest priority
        Link highPriorityLink = liste.findeHoechstePrioritaet();
        if (highPriorityLink != null) {
            System.out.println("Highest priority action: " + highPriorityLink.aktion + ", priority: " + highPriorityLink.prioritaet);
        } else {
            System.out.println("The list is empty.");
        }

        // Remove and print the action with highest priority
        String removedAction = liste.entferneAktionMitHoechsterPrioritaet();
        System.out.println("Removed action with highest priority: " + removedAction);

        // Try to find the action with highest priority again
        highPriorityLink = liste.findeHoechstePrioritaet();
        if (highPriorityLink != null) {
            System.out.println("New highest priority action: " + highPriorityLink.aktion + ", priority: " + highPriorityLink.prioritaet);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
