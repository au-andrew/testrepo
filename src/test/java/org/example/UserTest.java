package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserTest {
    @Test
    void testTheTests() {
        assertThat(new User().exists()).isTrue();
    }
}
