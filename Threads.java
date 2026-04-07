class Threads{
    static void collabCompany(){
        System.out.println("The Company Collab With Threads is Meta");
        long user = numberOfUsers();
        System.out.println("The total Number Of Users in Threads Are: "+user);
        founderName("Mark Zuckerberg");
    }
    static long numberOfUsers(){
        founderName("Mark Zuckerberg");
        long totalUsers = 150000000l;
        return totalUsers;
    }
    static void founderName(String name){
        System.out.println("The founder of Threads is: "+name);
    }
}

