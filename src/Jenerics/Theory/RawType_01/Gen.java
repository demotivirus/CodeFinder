package Jenerics.Theory.RawType_01;

import java.util.Collection;
import java.util.List;

public class Gen<T> {
    <T> void m(Collection<T> collection) {
        for (T s : collection) {
            System.out.println(s);
        }
    }
    <T> void m(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
