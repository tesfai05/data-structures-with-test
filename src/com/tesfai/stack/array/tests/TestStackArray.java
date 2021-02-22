package com.tesfai.stack.array.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tesfai.stack.array.StackArray;

class TestStackArray {

	private StackArray<String> stackArray;

	@BeforeEach
	public void setUp() {
		stackArray = new StackArray<String>();
	}

	@AfterEach
	void tearDown() throws Exception {
		stackArray = null;
	}

	@Test
	public void testEmpty() {
		assertThat(stackArray.isEmpty()).isEqualTo(true);

	}

	@Test
	public void testPush() {
		String a = "a";
		stackArray.push(a);
		assertThat(stackArray.isEmpty()).isEqualTo(false);

	}

	@Test
	public void testPop() {
		stackArray.push("a");
		assertThat(stackArray.pop()).isEqualTo("a");
		assertThat(stackArray.isEmpty()).isEqualTo(true);

	}

	@Test
	public void testPopForEmptyStack() {

		Assertions.assertThrows(IllegalStateException.class, () -> 
			stackArray.pop()
		);

	}

	@Test
	public void testPeek() {
		stackArray.push("a");
		assertThat(stackArray.peek()).isEqualTo("a");
		assertThat(stackArray.isEmpty()).isEqualTo(false);

	}

	@Test
	public void testPeekForEmptyStack() {

		Assertions.assertThrows(IllegalStateException.class, () -> {
			stackArray.peek();
		});

	}

	@Test
	public void testContains() {
		stackArray.push("a");
		assertThat(stackArray.contains("a")).isEqualTo(true);
		assertTrue(stackArray.contains("a"));
	}

	@Test
	public void testContainsForEmptyStack() {
		assertThat(stackArray.contains("a")).isEqualTo(false);

	}

}
