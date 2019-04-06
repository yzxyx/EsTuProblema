package com.djefry;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class DannyNoVinoCubano {

  @Test
  public void test() throws IOException {
    MockHttpServletResponse response = new MockHttpServletResponse();
    new HelloAppEngine().doGet(null, response);
    
  }
}
