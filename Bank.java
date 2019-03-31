import java.util.HashSet;
import java.util.Iterator;

public class Bank{

    private HashSet<BankAccount> accounts = new HashSet<BankAccount>();

    public void addAccount(BankAccount account) throws DuplicateAccountException {
        if (accounts.add(account)){
            accounts.add(account);
        }
        else{
            throw new DuplicateAccountException("This account already exists and has not been added");
        }
    }

    public BankAccount[] getAccounts() {
        Iterator iterator = accounts.iterator();
        BankAccount[] anArray = new BankAccount[accounts.size()];
        while (iterator.hasNext()) {
            for (int i=0; i<=accounts.size(); i++){
                anArray[i] = (BankAccount)iterator.next();
            }
        }
        return anArray;
    }
}