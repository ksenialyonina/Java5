import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.java5mvn.java5.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void test(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
