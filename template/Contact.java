package template;
import java.util.*;
/**
 * model a Contact
 * Contact has a name & list of phonebook entries
 *
 * Support adding phonebookEntry to a contact
 *
 * @Override hashCode and equals
 *
 */

class Contact {
    private String name;
//crate a list of PhonebookEntries...
    private List<PhonebookEntry> phonebookEntries;

    //Constructor: Initializes the contact with a name and an empty list of phonebook entries.
    public Contact(String name) {
        this.name = name;
        //initialize list
        this.phonebookEntries = new ArrayList<>();
    }

    // Adds a phonebook entry (phone number and type) to the contact.
    public void addPhonebookEntry(String number, String type) {
        PhonebookEntry entry = new PhonebookEntry(number, type);
        phonebookEntries.add(entry);
    }

    public String getName() {
        return name;
    }

    // Overrides the equals method to compare contacts based on their name.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If they are the same object, return true.
        if (obj == null || getClass() != obj.getClass()) return false; // If obj is null or not a Contact, return false.

        Contact contact = (Contact) obj;
        return Objects.equals(name, contact.name); // Compare names.
    }

    // Overrides hashCode to demonstrate intentional collisions in some cases.
    @Override
    public int hashCode() {
        return name.length() % 2; // Causes intentional collisions for names with the same length parity.
    }

    // Returns the list of phonebook entries for this contact.
    public List<PhonebookEntry> getPhonebookEntries() {
        return phonebookEntries;
    }

    // Returns a formatted string representation of the contact and their phone numbers.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append(", Phone Number(s): [");

        for (int i = 0; i < phonebookEntries.size(); i++) {
            sb.append(phonebookEntries.get(i).getPhoneNumber()).append(" ").append(phonebookEntries.get(i).getType());
            if (i < phonebookEntries.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
