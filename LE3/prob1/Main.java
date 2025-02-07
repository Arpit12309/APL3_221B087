public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();
        Bharatvanshi kaurav = new Kaurav();

        System.out.println("Arjun:");
        arjun.fight();
        ((Pandav) arjun).obey();
        ((Pandav) arjun).kind();

        System.out.println("\nBheem:");
        bheem.fight();
        ((Pandav) bheem).obey();
        ((Pandav) bheem).kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        ((Kaurav) vikarn).obey();
        ((Kaurav) vikarn).kind();

        System.out.println("\nKaurav:");
        kaurav.fight();
        ((Kaurav) kaurav).obey();
        ((Kaurav) kaurav).kind();
    }
}
