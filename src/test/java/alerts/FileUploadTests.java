package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/PC/IdeaProjects/SeleniumWebDriverTAU/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded file is incorrect");
    }
}
