package guru.refactoring.iterator.example.iterators;

import guru.refactoring.iterator.example.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
