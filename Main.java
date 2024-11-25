public class Main {
    public static void main(String[] args) {
        Subscriber erlyn = new Subscriber("Erlyn");
        Subscriber jerry = new Subscriber("Jerry");
        Subscriber paulo = new Subscriber("Paulo");

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(erlyn);
        newsAgency.subscribe(jerry);
        newsAgency.subscribe(paulo);

        newsAgency.publishNews("Massive Earthquake Strikes Coastal City, Rescue Efforts Underway");

        System.out.println("-----------------------------------");

        newsAgency.unsubscribe(jerry);

        newsAgency.publishNews("NASA Discovers Potentially Habitable Exoplanet");
    }
}
