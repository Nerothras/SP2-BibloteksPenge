public class LibraryRoyaltyCalculator {


    public static void main(String[] args) {


        Author olgaRavn = new Author("Olga Ravn");
        olgaRavn.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        olgaRavn.addTitle(new AudioBook("Celestine (lydbog)", "SKØN", 140, 192));
        System.out.println(olgaRavn.getName() + ": " + olgaRavn.calculateRoyalties() + "kr");


        Author Go = new Author("Geroge Orwell");
        Go.addTitle(new PrintedBook("1984", "SKØN", 200, 328));
        Go.addTitle(new AudioBook("1984 (lydbog)", "SKØN", 200, 660));
        System.out.println(Go.getName() + ": " + Go.calculateRoyalties() + "kr");



        Author Ws = new Author("William Shakespeare");
        Ws.addTitle(new PrintedBook("Hamlet", "SKØN", 400,250));
        Ws.addTitle(new AudioBook("Hamlet", "SKØN", 400, 240));
        System.out.println(Ws.getName() + ": " + Ws.calculateRoyalties() + "kr");

        Author Jd = new Author("Julia Donaldson");
        Jd.addTitle(new PrintedBook("The snail and the Whale", "BI", 2300, 32));
        System.out.println(Jd.getName() + ": " + Jd.calculateRoyalties() + "kr");




    }
}
