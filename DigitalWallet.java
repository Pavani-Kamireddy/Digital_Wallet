import java.util.*;

public class DigitalWallet {
  String name;
  static double bal_in_wallet=0.0;
  static int sno=0;
  Transaction[] array;
  static ArrayList<Transaction> result=new ArrayList<Transaction>();
  static ArrayList<Transaction> result1=new ArrayList<Transaction>();
  static ArrayList<Transaction> result2=new ArrayList<Transaction>();
  /* Store all the Add Money, Pay and Reward transactions as transaction objects */

  /* implement all the methods given below */

  /* Default constructor */
  public DigitalWallet(String name ) {
    this.name=name;
  }

  /* Add money to the wallet */
  public boolean addMoney(Transaction tx) { 
    result.add(tx);
    sno++;
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
    return bal_in_wallet;
  }

  /* Make a payment */
  public boolean pay(Transaction tx) { 
    result.add(tx);
    sno++;
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
  public void printStatement() {
    System.out.println();
    for(int i=0;i<result.size();i++) {
      System.out.println(result.get(i).type+" "+result.get(i).merchant+" "+result.get(i).amount);
    }
  }

  /* Return the list of reward transactions */
  public Transaction[] getRewardTransactions() {
    int j=0;
    for(int i=0;i<array.length;i++) {
      if(result.get(i).type.equals("Payment")) {
        result2.add(result.get(i));
        j++;
      }
    }
    Transaction[] array2=new Transaction[j];
    for(int i=0;i<array2.length;i++) {
      array2[i]=new Transaction();
    }
    for(int i=0;i<array2.length;i++) {
      array2[i]=result2.get(i);
    }
    return array2;
  }

  /* Return all the transactions */
  public Transaction[] getAllTransactions() {
    array=new Transaction[sno];
    for(int i=0;i<array.length;i++) {
      array[i]=new Transaction();
    }
    for(int i=0;i<array.length;i++) {
      array[i]=result.get(i);
    }
    return array;
  }

  /* Return the transactions that match the merchant name */
  public Transaction[] getTransactions(String merchantName) {
    int j=0;
    for(int i=0;i<array.length;i++) {
      if(result.get(i).merchant.equals(merchantName)) {
        result1.add(result.get(i));
        j++;
      }
    }
    Transaction[] array1=new Transaction[j];
    for(int i=0;i<array1.length;i++) {
      array1[i]=new Transaction();
    }
    for(int i=0;i<array1.length;i++) {
      array1[i]=result1.get(i);
    }
    return array1;
  }

}
