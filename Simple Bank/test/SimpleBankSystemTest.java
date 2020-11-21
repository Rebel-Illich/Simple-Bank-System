
import banking.Main;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testcase.TestCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SimpleBankSystemTest extends StageTest<String> {

    public SimpleBankSystemTest(){
        super(Main.class);
    }

    private static String correctCardNumber = "";
    private static String correctPin = "";
    private static String incorrectCardNumber = "";
    private static String incorrectPin = "";
    private static String databaseFileName = "card.s3db";
    private static String tempDatabaseFileName = "tempDatabase.s3db";
    private static Map<String,String> correctData = new HashMap<>();
    private static Connection connection;
    private static boolean isCompleted = false;

     @Override
    public List<TestCase<String>> generate() {
        return List.of(
}
