class Swiggy{
 
 static int checkItem(String foodItem){
 int price=0;
 if("R M biriyani"==foodItem){
 System.out.println("food item is:"+foodItem);
 price=250;
 return price;
 }else if("fried rice"==foodItem){
 System.out.println("food item is:"+foodItem);
 price=90;
 return price;
 }else if("chilli chiken"==foodItem){
 System.out.println("food item is:"+foodItem);
 price=150;
 return price;
 }else{
 System.out.println("food item not found");
 return 0;
 }}
 
  static int checkItem(String foodItem,int price,int noItems){
 int totalprice=0;
 if("R M biriyani"==foodItem){
 totalprice=price*noItems;
 return totalprice;
 }else if("fried rice"==foodItem){
  totalprice=price*noItems;
 return totalprice;
 }else if("chilli chiken"==foodItem){
  totalprice=price*noItems;
 return totalprice;
 }else{
 return 0;
 }
 }
 
 public static void main(String[]args){
 int price=0;
 price=Swiggy.checkItem("fried rice");
 System.out.println("for one plate:"+price);
 
 int totalprice=Swiggy.checkItem("fried rice",price,5);
 System.out.println("total plate:"+totalprice);
 
 }
 }