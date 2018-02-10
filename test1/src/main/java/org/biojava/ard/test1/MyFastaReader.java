package org.biojava.ard.test1;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.io.FastaReaderHelper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyFastaReader {

    public static String getSequence(String filename) {
        LinkedHashMap<String, DNASequence> a = null;
        try {
            a = FastaReaderHelper.readFastaDNASequence(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sequence = "";
        for (  Map.Entry<String, DNASequence> entry : a.entrySet() ) {
            sequence = entry.getValue().getSequenceAsString();
            //System.out.println( entry.getValue().getOriginalHeader() + "=" + sequence);
        }
        return sequence;
    }
}
