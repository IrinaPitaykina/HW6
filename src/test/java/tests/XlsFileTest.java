package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class XlsFileTest {
    private final String xlsxData = "лифт";
    private final String xlsData = "сердце";

    @Test
    void xlsSimpleTest() {
        String xlsFilePath = "./src/test/resources/files/Xls.xls";

        XLS xls = new XLS(getFile(xlsFilePath));
        assertThat(xls, XLS.containsText(xlsData));
    }

    @Test
    void xlsCellTest() {
        String xlsFilePath = "./src/test/resources/files/Xls.xls";

        XLS xls = new XLS(getFile(xlsFilePath));
        String actualData = getCellValueXlsFile(xls, 0, 1, 0);
        assertThat(actualData, containsString(xlsData));
    }

    @Test
    void xlsxTest() {
        String xlsxFilePath = "./src/test/resources/files/Xlsx.xlsx";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(xlsxData));
    }
}
