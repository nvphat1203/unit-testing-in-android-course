package com.techyourchance.unittestingfundamentals.example2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class StringReverserTest {

    StringReverser SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringReverser();
    }

    @Test
    public void reserve_emptyString_emptyStringReturned() throws Exception{
        String result = SUT.reverse("");
        assertThat(result, is(""));
    }
}