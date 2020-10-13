package com.flowersouth;

import com.flowersouth.feedbase.idlist.IDChars;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IdValidatorTest {
    @Test
    public void testUTF8Char() {
        String s = "❤️";
        boolean valid = IDChars.validateIdChars(s);
        Assert.assertFalse(valid);
    }

    @Test
    public void testSuccess() {
        String id = "f98y4hfjksfasdgjkahsgd";
        boolean valid = IDChars.validateIdChars(id);
        Assert.assertTrue(valid);
    }

    @Test
    public void testFailed() {
        String id = "f98y4hf&*^jksfasdgjkahsgd";
        boolean valid = IDChars.validateIdChars(id);
        Assert.assertFalse(valid);
    }

    @Test
    public void allInOneTest() {
        String[] td = new String[]{null, "", " ", "\n","\t","asf\n333","aa\t\t\t"};
        Arrays.stream(td)
                .forEach(id -> {
                    boolean valid = IDChars.validateIdChars(id);
                    Assert.assertFalse(valid);
                });
    }
}
