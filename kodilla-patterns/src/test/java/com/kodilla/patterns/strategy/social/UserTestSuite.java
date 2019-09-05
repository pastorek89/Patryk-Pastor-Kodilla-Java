package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mateusz = new XGeneration("Mateusz Lizęga");
        User damian = new ZGeneration("Damian Paluszkiewicz");
        User marta = new Millenials("Marta Kądzior");

        //When
        String mateuszUse = mateusz.sharePost();
        System.out.println("Mateusz use: " + mateuszUse);
        String damianUse = damian.sharePost();
        System.out.println("Damian use: " + damianUse);
        String martaUse = marta.sharePost();
        System.out.println("Marta use: " + martaUse);

        //Then
        Assert.assertEquals("Facebook", mateuszUse);
        Assert.assertEquals("Twitter", damianUse);
        Assert.assertEquals("Snapchat", martaUse);

    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User mateusz = new XGeneration("Mateusz Lizęga");

        //When
        String mateuszUse = mateusz.sharePost();
        System.out.println("Mateusz use: " + mateuszUse);
        mateusz.changePreferences(new TwitterPublisher());
        mateuszUse = mateusz.sharePost();
        System.out.println("Mateusz use: " + mateuszUse);

        //Then
        Assert.assertEquals("Twitter", mateuszUse);
    }
}
