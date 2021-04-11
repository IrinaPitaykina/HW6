package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getFile;

public class PdfFileTest {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/Pdf.pdf";
        String expectedData = "Я зол постоянно";

        PDF pdf = new PDF(getFile(pdfFilePath));
        assertThat(pdf, containsText(expectedData));
    }
}
