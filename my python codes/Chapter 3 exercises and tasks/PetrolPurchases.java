public class PetrolPurchases{
private String stationLocation;
private String petrol;
private int quantity;
private double literPrice;
private double discount;

public PetrolPurchases(String stationLocation,String petrol,int quantity,double liter, double discount){
 this. stationLocation = stationLocation;
this.petrol= petrol;
this.quantity = quantity;
this.literPrice = literPrice;
this.discount = discount;
}
public void setStationLocation(String stationLocation){
this.stationLocation = stationLocation;
}
public void setPetrol(String petrol){
this.petrol = petrol;
}
public void setQuantity(int quantity){
this.quantity = quantity;
}
public void setLitre(double literPrice){
this.literPrice = literPrice;
}
public void setDiscount(double discount){
this.discount = discount;
}
public String getStationLocation(){
return stationLocation;
}
public String getPetrol(){
return petrol;
}
public double getLiterPrice(){
return literPrice;
}
public double getQuantity(){
return quantity;}
public double getDiscount(){
return discount;
}
double purchasesAmount = (literPrice * quantity) - (literPrice * quantity * discount/100);
public double getPurchasesAmount(){
return purchasesAmount;
}
}