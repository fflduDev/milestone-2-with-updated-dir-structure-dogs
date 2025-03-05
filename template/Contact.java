package template;

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
    public Contact(String name) {
        this.name = name;
        //initialize list
    }

    public void addPhoneBookEntry(String number, String type) {
        //create a pbEntry with the incoming num/type
        //add that pbEntry to your list of pbEntries

    }

}
