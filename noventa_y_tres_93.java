public class noventa_y_tres_93 {
    private final String id;   // read-only: only getter provided
    private String password;   // write-only: only setter provided

    Q93_ReadOnlyWriteOnly(String id) {
        this.id = id;
    }

    String getId() { return id; }         // read-only field
    void setPassword(String password) {   // write-only field
        this.password = password;
        System.out.println("Password set successfully");
    }

    public static void main(String[] args) {
        Q93_ReadOnlyWriteOnly obj = new Q93_ReadOnlyWriteOnly("USER123");
        System.out.println("ID: " + obj.getId());
        obj.setPassword("secret123");
        // no getPassword() available -- it's write-only
    }
}
