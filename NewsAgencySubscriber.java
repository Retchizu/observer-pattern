public interface NewsAgencySubscriber {

    public void subscribe(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void notifySubscribers();
}