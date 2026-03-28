class Google{

public static void main(String[] args){
System.out.println("Hi Google");
getGoogle();

System.out.println("hi Google I have two subject marks u need add and print");
int hindi = 80;
int english = 89;
String isPass = "PASS";
toAdd(hindi,english,isPass);

}

static void getGoogle(){
	Sysytem.out.println("How can i help you");
}

static void toAdd(int subjectOne,int subjectTwo,String isPass){
	System.out.println("okay");
	int marks = subjectOne + subjectTwo;
	System.out.println(marks);
	System.out.println(isPass);
}
}