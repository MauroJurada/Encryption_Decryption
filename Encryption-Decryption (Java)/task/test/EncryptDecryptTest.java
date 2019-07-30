import encryptdecrypt.Main;
import org.hyperskill.hstest.v5.stage.BaseStageTest;
import org.hyperskill.hstest.v5.testcase.PredefinedIOTestCase;

import java.util.List;

public class EncryptDecryptTest extends BaseStageTest {
    public EncryptDecryptTest() throws Exception {
        super(Main.class);
    }

    @Override
    public List<PredefinedIOTestCase> generate() {
        return List.of(
            new PredefinedIOTestCase("", "dv ulfmw z givzhfiv!"));
    }
}
