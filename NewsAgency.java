import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubscriber {
    private String news;
    private String datePublished;
    private List<Subscriber> subscriberList;

    public NewsAgency() {
        subscriberList = new ArrayList<>();
    }

    public String getNews() {
        return news;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public void publishNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(news);
        }
    }

}