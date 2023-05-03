public class Reader extends User{
    public String type;
    public String FirstName;
    public String LastName;
    public String Address;
    public int CellPhone;
    public String Email;
    public String isBlocked;
    public  Reader(int id,int Password, String FirstName,String LastName,String Address,int CellPhone,String Email,String isBlocked) {
        super(id, Password);
        this.FirstName = FirstName;
        this.LastName = LastName ;
        this.Address = Address;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.isBlocked =isBlocked;
    }
}
