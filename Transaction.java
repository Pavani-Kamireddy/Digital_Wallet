import java.util.Date;

public class Transaction {
	String type;
	double amount;
  String merchant;
  String str;
  String process;
  String desc;
  public void setType(String type) {
  	this.type=type;
  }
  public String getType() {
    return type;
  }
  public void setAmount(double amount) {
  	this.amount=amount;
  }
  public double getAmount() {
    return amount;
  }
  
  public void setDate(Date date) {
  	date=new Date();
  	str = String.format("Current Date/Time : %tc", date );
	  //System.out.printf(str);
  }
  public String getDate() {
    return str;
  }
  public void setDescription(String desc) {
    this.desc=desc;
  }
  public String getDescription(){
    return desc;
  }
  public void setMerchant(String merchant) {
    this.merchant=merchant;
  }
  public String getMerchant(){
    return merchant;
  }
}
