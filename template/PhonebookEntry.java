package template;

/**
 *   model a PhonebookEntry 
 *   
 *   PhonebookEntry has a phoneNumber and type
 *   
 *   
 *   
 */

class PhonebookEntry {
    private String phoneNumber;
    private String type;

    public void phonebookEntry(String phoneNumber, String type) {
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + ": " + phoneNumber;
    }
}