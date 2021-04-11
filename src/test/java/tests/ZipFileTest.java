package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import static utils.Zip.unzip;

public class ZipFileTest {
    String zipFilePath = "src/test/resources/files/zipTest.zip";
    String unzipFolderPath = "src/test/resources/files/unzipped";
    String zipPassword = "avenger";



    @Test
    void zipWithPasswordTest() throws ZipException {
        unzip(zipFilePath, unzipFolderPath, zipPassword);

    }
}
