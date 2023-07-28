public class CheckinAccount extends BankAccount {
        private float intrestRate = 2;
      
        CheckinAccount(int account, double initialDeposit) {
          super(account, initialDeposit);
        }
      
        @Override
        public double calculateIntrest() {
          double balance = this.getBalance();
          double intrest = balance * intrestRate / 100;
          this.setBalance(balance + intrest);
      
          return intrest;
        }
      }

