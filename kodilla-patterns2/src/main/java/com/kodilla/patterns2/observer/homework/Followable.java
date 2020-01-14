package com.kodilla.patterns2.observer.homework;

public interface Followable {

    void registerFollower(Follower follower);
    void removeFollower(Follower follower);
    void notifyFollowers();
}

