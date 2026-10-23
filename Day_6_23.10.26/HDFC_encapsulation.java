
package Day_6;

public class BankOfHDFC {
    public static void main(String[] args) {
        Gpay e = new Gpay();

        e.setName("Aswini");
        e.setAccount_no(1010101);
        e.setEmail("aswini@gmail.com");
        e.setAccountType("Savings");
        e.setBalance(25000);

        System.out.println(e.getName());
        System.out.println(e.getAccount_no());
        System.out.println(e.getEmail());
        System.out.println(e.getAccountType());
        System.out.println(e.getBalance());
    }
}

class HDFC {
    private String name = "Aswini";
    private long account_no = 1010101;
    private String Email = "aswiniesakkiappan@gmail.com";
    private String AccountType = "Savings";
    private double balance = 25000;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }

    public long getAccount_no() {
        return account_no;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Gpay extends HDFC {

}
