package com.example.demo.smile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SmileTest {

  @Test
  void testConstructors() {
    // Long and Boolean
    Smile subject = new Smile(1, true, true);
    assertEquals(1, subject.getId());
    assertEquals(true, subject.isCrying());
    assertEquals(true, subject.isLaughing());
  }

}
