class TeaPowderRunner{

public static void main(String[] Tea){

TeaPowder.brand();
TeaPowder.price(250);
String q = TeaPowder.Quantity();
System.out.println("Quantity:"+q);
String orders = TeaPowder.orderDetails("Shaan","niyamath");
System.out.println("Orders:"+orders);
}
}