import ir.moke.jenkins.MyLib;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnitPlatform.class)
public class SampleTestClass {

    private static MyLib myLib;

    @BeforeAll
    public static void init() {
        myLib = new MyLib();
    }

    @TestFactory
    public List firstTest() {
        myLib.sampleMethod();
        return new ArrayList();
    }

    @TestFactory
    public List secondTest() {
        myLib.sum(12, 22);
        return new ArrayList();
    }
}
