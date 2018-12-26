package ru.simple;

import org.junit.Test;
import ru.simple.singleton.SingleFour;
import ru.simple.singleton.SingleOne;
import ru.simple.singleton.SingleThree;
import ru.simple.singleton.SingleTwo;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void whenSingleEnum() {
        SingleTwo oneObj = SingleTwo.INSTANCE;
        SingleTwo twoObj = SingleTwo.INSTANCE;
        assertThat(oneObj.hashCode(), is(twoObj.hashCode()));
    }

    @Test
    public void whenSingleLazyOne() {
        SingleOne oneObj = SingleOne.getInstance();
        SingleOne twoObj = SingleOne.getInstance();
        assertThat(oneObj.hashCode(), is(twoObj.hashCode()));
    }

    @Test
    public void whenSingleEager() {
        SingleThree oneObj = SingleThree.getInstance();
        SingleThree twoObj = SingleThree.getInstance();
        assertThat(oneObj.hashCode(), is(twoObj.hashCode()));
    }

    @Test
    public void whenSingleLazyTwo() {
        SingleFour oneObj = SingleFour.getInstance();
        SingleFour twoObj = SingleFour.getInstance();
        assertThat(oneObj.hashCode(), is(twoObj.hashCode()));
    }
}
