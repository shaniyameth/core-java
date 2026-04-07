class Swiggy{
    static void collabCompany(){
        System.out.println("The Company Collab With Swiggy is Swiggy Limited");
        long user = numberOfUsers();
        System.out.println("The total Number Of Users in Swiggy Are: "+user);
        founderName("Sriharsha Majety, Nandan Reddy & Rahul Jaimini");
    }
    static long numberOfUsers(){
        founderName("Sriharsha Majety, Nandan Reddy & Rahul Jaimini");
        long totalUsers = 100000000l;
        return totalUsers;
    }
    static void founderName(String name){
        System.out.println("The founders of Swiggy are: "+name);
    }
}

