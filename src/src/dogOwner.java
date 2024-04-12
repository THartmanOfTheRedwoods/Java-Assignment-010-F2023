public class dogOwner {

    private String name;
    private String contactNumber;

    public dogOwner(String ownerName, String ownerNumber){
        name = ownerName;
        contactNumber = ownerNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
