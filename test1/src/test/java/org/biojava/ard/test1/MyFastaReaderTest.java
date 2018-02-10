package org.biojava.ard.test1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFastaReaderTest {

    @Test
    public void getSequence() {
        System.out.println(MyFastaReader.getSequence("/Users/ard/dev/BioJavaTests/test1/src/main/java/org/biojava/ard/test1/mycobacterium.fasta.txt"));
    }
}