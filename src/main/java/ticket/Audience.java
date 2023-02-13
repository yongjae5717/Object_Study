package ticket;

public class Audience {
    public Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
