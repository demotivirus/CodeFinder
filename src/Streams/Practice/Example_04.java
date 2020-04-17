package Streams.Practice;

import java.util.*;
import java.util.function.Consumer;

public class Example_04 {
    public static abstract class Sendable<T> {
        private String from;
        private String to;
        private T content;

        public Sendable(String from, String to, T content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public Sendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public T getContent() {
            return content;
        }
    }

    public static class MailMessage extends Sendable<String>{
        private String content;

        public MailMessage(String from, String to, String string) {
            super(from, to);
            content = string;
        }

        public String getContent() {
            return content;
        }
    }

    public static class Salary extends Sendable<Integer>{
        private Integer content;

        public Salary(String from, String to, Integer itgr) {
            super(from, to);
            content = itgr;
        }

        public Integer getContent() {
            return content;
        }
    }

    public static class MailService<T> implements Consumer<Sendable<T>> {
        private Map<String, List<T>> mailBox;

        public MailService(){
            mailBox = new HashMap<String, List<T>>(){
                @Override
                public List<T> get(Object key) {
                    if (mailBox.containsKey(key)) {
                        return mailBox.getOrDefault(key, null);
                    } else {
                        List<T> list = new ArrayList<>();
                        mailBox.put((String)key, list);
                        return list;
                    }
                }
            };
        }

        @Override
        public void accept(Sendable<T> sendable) {
            List list = mailBox.get(sendable.getTo());
            list.add(sendable.getContent());
        }

        public Map<String, List<T>> getMailBox(){
            return mailBox;
        }
    }
}
