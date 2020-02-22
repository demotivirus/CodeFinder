package OOP.Practice.MailService;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    private Map<String, List<T>> mailBox;

    public MailService(){
        mailBox = new NewHashMap<>();
    }

    @Override
    public void accept(Sendable<T> sendable) {
        if(mailBox.containsKey(sendable.getTo())) {
            List<T> val;
            val = mailBox.get(sendable.getTo());
            val.add(sendable.getContent());
            mailBox.put(sendable.getTo(), val);
        }
        else {
            List<T> val;
            val = new LinkedList<>();
            val.add(sendable.getContent());
            mailBox.put(sendable.getTo(), val);
        }
    }

    public Map<String, List<T>> getMailBox(){
        return mailBox;
    }

    private static class NewHashMap<K,V> extends HashMap<K,V>{
        @Override
        public V get(Object key){
            V temp = super.get(key);
            try {
                if (temp == null) temp = (V)Collections.emptyList();
            } catch (ClassCastException e) {}
            return temp;
        }
    }
}
