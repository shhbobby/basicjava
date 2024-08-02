package structural.facade;

public class TransfermanFacade {
    private Head head;
    private Body body;
    private  Hand hand;

    public TransfermanFacade() {
        head = new Head();
        body = new Body();
        hand = new Hand();
    }

    public void done(){

        head.done();
        body.done();
        hand.done();
    }

}
