public class DigitalWallet {
  
  /* Store all the Add Money, Pay and Reward transactions as transaction objects */

  /* implement all the methods given below */

  /* Default constructor */
  public DigitalWallet(String name ) {}

  /* Add money to the wallet */
  public boolean addMoney(Transaction tx) { return false; }

  /* Return the balance in the wallet */
  public double getBalance() {return 0.0;}

  /* Make a payment */
  public boolean pay(Transaction tx) { return false; }

  /* print statement */
  public void printStatement() {}

  /* Return the list of reward transactions */
  public Transaction[] getRewardTransactions() {return null;}

  /* Return all the transactions */
  public Transaction[] getAllTransactions() {return null;}

  /* Return the transactions that match the merchant name */
  public Transaction[] getTransactions(String merchantName) {return null;}

}
