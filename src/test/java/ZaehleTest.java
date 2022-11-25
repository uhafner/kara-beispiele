import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import edu.hm.hafner.kara.Zaehle;

import de.i8k.karalight.world.World;

class ZaehleTest extends AbstractKaraTest {
    @MethodSource
    @ParameterizedTest(name = "{index} => {0} ({1})")
    @DisplayName("Zeichne die HM Initialen")
    void shouldSolveAssignment(final World start, final World expected) {
        verifyAssignment(start, Zaehle::main, expected);
    }

    static Stream<Arguments> shouldSolveAssignment() {
        return createStreamOfWorlds("ZaehleAmStart");
    }
}

