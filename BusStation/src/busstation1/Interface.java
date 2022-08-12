package busstation1;

public interface Interface {
    
    public boolean loginCustomerVerification(String username, String password);
    public boolean loginDriverVerification(String username, String password);
    public boolean loginManagerVerification(String username, String password);
    public String GetFilePath();

}
