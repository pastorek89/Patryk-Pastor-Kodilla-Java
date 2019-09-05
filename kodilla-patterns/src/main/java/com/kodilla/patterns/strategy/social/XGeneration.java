package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;

public class XGeneration extends User {

    public XGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
