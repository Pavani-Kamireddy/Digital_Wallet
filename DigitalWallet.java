public class DigitalWallet {
  
  String name;
  static double bal_in_wallet=0.0;
  /* Store all the Add Money, Pay and Reward transactions as transaction objects */

  /* implement all the methods given below */

  /* Default constructor */
  public DigitalWallet(String name ) {
    this.name=name;
  }

  /* Add money to the wallet */
  public boolean addMoney(Transaction tx) { 
    if(tx.getAmount()<0||tx.getAmount()>5000) {
      return false;
    }
    else { 
      bal_in_wallet=bal_in_wallet+tx.getAmount();
      return true;
    }
  }

  /* Return the balance in the wallet */
  public double getBalance() {
    return return bal_in_wallet;;
    
  }

  /* Make a payment */
  public boolean pay(Transaction tx) { 
    if(getBalance()<tx.getAmount())
      return false; 
    else {
      bal_in_wallet=bal_in_wallet-tx.getAmount();
      if(tx.getType().equals("Payment")) {
          int temp=(int)tx.getAmount()/100;
          bal_in_wallet=bal_in_wallet+temp*10;
      }
      return true;
    }
  }

  /* print statement */
  public void printStatement() {}

  /* Return the list of reward transactions */
  public Transaction[] getRewardTransactions() {return null;}

  /* Return all the transactions */
  public Transaction[] getAllTransactions() {return null;}

  /* Return the transactions that match the merchant name */
  public Transaction[] getTransactions(String merchantName) {return null;}

}
