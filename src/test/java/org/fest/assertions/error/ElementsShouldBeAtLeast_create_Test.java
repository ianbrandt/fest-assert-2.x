/*
 * Created on Mar 17, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2012 the original author or authors.
 */
package org.fest.assertions.error;

import static org.fest.assertions.error.ElementsShouldBeAtLeast.elementsShouldBeAtLeast;
import static org.fest.util.Collections.list;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import org.fest.assertions.core.TestCondition;
import org.fest.assertions.description.TextDescription;

/**
 * Tests for <code>{@link ElementsShouldBeAtLeast#create(Description)}</code>.
 * 
 * @author Nicolas François
 * @author Joel Costigliola
 */
public class ElementsShouldBeAtLeast_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = elementsShouldBeAtLeast(list("Yoda", "Solo", "Leia"), 2, new TestCondition<String>("a Jedi"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TextDescription("Test"));
    assertEquals("[Test] expecting elements:\n<['Yoda', 'Solo', 'Leia']>\n to be at least 2 times <a Jedi>", message);
  }

}
