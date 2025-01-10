package com.example.pmd;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

public class ApplicationTest {

    @Test
    public void testMainMethodCallsSpringApplicationRun() {
        String[] args = {"arg1", "arg2"};
        try (MockedStatic<SpringApplication> mockedStatic = mockStatic(SpringApplication.class)) {
            Application.main(args);

            mockedStatic.verify(
                    () -> SpringApplication.run(Application.class, args),
                    times(1)
            );
        }
    }

    @Test
    public void testMainWithEmptyArguments() {
        try (MockedStatic<SpringApplication> mockedSpringApplication = mockStatic(SpringApplication.class)) {
            Application.main(new String[]{});
            mockedSpringApplication.verify(() -> SpringApplication.run(eq(Application.class), any(String[].class)));
        }
    }

    @Test
    public void testMainWithNullArguments() {
        try (MockedStatic<SpringApplication> mockedSpringApplication = mockStatic(SpringApplication.class)) {
            Application.main(null);
            mockedSpringApplication.verify(() -> SpringApplication.run(eq(Application.class), eq(null)));
        }
    }

}