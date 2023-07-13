package Day05_1;

public class Demo03 {
    public void main(String[] args) {
        Bank bank = new Bank();

    }
    class Bank{
        String account;
        int password;
        double balance;

        public Bank() {
        }

        public Bank(String account, int password, double balance) {
            this.account = account;
            this.password = password;
            this.balance = balance;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
