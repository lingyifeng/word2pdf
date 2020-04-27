package com.lyf.word2pdf;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.InputStream;

public class Test {

    public static void main(String[] args)throws Exception {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("\\license.xml");
        License aposeLic = new License();
        aposeLic.setLicense(is);
        File file = ResourceUtils.getFile("classpath:Test.docx");
        File outFile = new File("Test.pdf");
        Document doc = new Document(file.getAbsolutePath());
        doc.save(outFile.getAbsolutePath(), SaveFormat.PDF);
    }

}
