public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Pandavs:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        System.out.println();
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nKauravs:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        System.out.println();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
