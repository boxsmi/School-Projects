/* Created by Aleksandr 
                       Smirnov
                                */
package lesson15;

import Interfaces.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null && b == null) {
            throw new NullPointerException("a==null && b==null");
        }
        ArrayList<Integer> difference = new ArrayList<>();
        for (Integer temp:a) {
            if(!b.contains(temp))
                difference.add(temp);
        }
        for (Integer temp:b) {
            if(!a.contains(temp))
                difference.add(temp);
        }
        return difference;
    }
}
