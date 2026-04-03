class Canva {

    String designName;
    String templateType;
    int pageCount;

    public Canva() {
    }

    public Canva(String designName, String templateType, int pageCount) {
        this.designName = designName;
        this.templateType = templateType;
        this.pageCount = pageCount;
    }

    public void display() {
        System.out.println(designName);
        System.out.println(templateType);
        System.out.println(pageCount);
        System.out.println("-------------------");
    }
}

