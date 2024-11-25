public class Subscriber implements SubscriberObserver {
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news) {
        System.out.println(subscriberName + ", News just got in!\n" + news);
    }

}
