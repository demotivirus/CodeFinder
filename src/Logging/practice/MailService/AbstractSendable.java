package Logging.practice.MailService;

public abstract class AbstractSendable implements Sendable{
    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to){
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable sendable = (AbstractSendable) o;

        if (!from.equals(sendable.from)) return false;
        if (!to.equals(sendable.to)) return false;

        return true;
    }
}
