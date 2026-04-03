class JioHotstar {

    String showName;
    String language;
    int duration;

    public JioHotstar() {
    }

    public JioHotstar(String showName, String language, int duration) {
        this.showName = showName;
        this.language = language;
        this.duration = duration;
    }

    public void display() {
        System.out.println(showName);
        System.out.println(language);
        System.out.println(duration);
        System.out.println("-------------------");
    }
}

