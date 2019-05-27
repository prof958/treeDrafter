/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author prof958
 */
public class treeDrafterTest {
 private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void treeCheck() {
        // given
        treeDrafter christmasTreeDrafter = new treeDrafter();

        // when
        christmasTreeDrafter.draw();

        // then
        Assert.assertEquals("          *\r\n" +
                "         ***\r\n" +
                "        *****\r\n" +
                "       *******\r\n", out.toString());
    }
}
