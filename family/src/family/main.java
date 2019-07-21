package family;

public class main {

    public static void main(String[] args) {

        mother angelina = new mother("angelina", 33, "Seo", 5000, "iron");
        father jamie = new father("jamie", 34, "accountant", 2000);
        child jamieJR = new child("jamiejunior", 3, "kammion");

        Family boltons = new Family(jamie, angelina, jamieJR, "Bolton");

        mother elizabeth = new mother("elizabeth", 23, "hairdresser", 1500, "iron");
        father sherlock = new father("sherlock", 25, "web designer", 3000);
        child emily = new child("emily", 4, "barby");

        Family holmes = new Family(sherlock, elizabeth, emily, "Holmes");

        holmes.getFather().info();

        holmes.getFather().work();
        
        boltons.info();
        
        holmes.info();

    }

}
