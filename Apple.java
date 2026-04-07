class Apple{
    static void collabCompany(){
        System.out.println("The Company Collab With Apple is Apple Inc");
        long user = numberOfUsers();
        System.out.println("The total Number Of Users in Apple Are: "+user);
        founderName("Steve Jobs, Steve Wozniak & Ronald Wayne");
    }
    static long numberOfUsers(){
        founderName("Steve Jobs, Steve Wozniak & Ronald Wayne");
        long totalUsers = 1500000000l;
        return totalUsers;
    }
    static void founderName(String name){
        System.out.println("The founders of Apple are: "+name);
    }
}



