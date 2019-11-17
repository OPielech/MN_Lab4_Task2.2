import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    @BeforeAll
    static void init() {
        System.out.println("Tests begin...");
    }

    @BeforeEach
    void setup() {
        System.out.println("Next test begins in a moment...");
    }

    @Test
    @DisplayName("Regula falsi test")
    void RegulaFalsi() {
        RegulaFalsi test = new RegulaFalsi(-1, 3, 0.01, 1000, 0.6, x -> x = Math.exp(-x) - x);
        float result = (float) test.solver();
        assertEquals(0.56714329, result);
    }

    @Test
    @DisplayName("Regula falsi test")
    void FixedPointsIteration() {
        FixedPointsIteration test = new FixedPointsIteration(10, 0.0001, 1000, x -> x = Math.exp(-x) - x);
        float result = (float) test.solver();
        assertEquals(0.56714329, result);
    }

    @Test
    @DisplayName("Regula falsi test")
    void NewtonRaphsonMethod() {
        NewtonRaphsonMethod test = new NewtonRaphsonMethod(10, 0.0001, 1000, x -> x = Math.exp(-x) - x);
        float result = (float) test.solver();
        assertEquals(0.56714329, result);
    }

    @Test
    @DisplayName("Regula falsi test")
    void SecandMethod() {
        SecandMethod test = new SecandMethod(10, 0.0001, 1000, x -> x = Math.exp(-x) - x);
        float result = (float) test.solver();
        assertEquals(0.56714329, result);
    }
}//end of class
