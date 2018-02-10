package org.biojava.ard.test1;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.AccessionID;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.io.FastaWriterHelper;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Testing biojava core version 4.2.11");
        App aApp = new App();
        try {
            aApp.reverseComplement(MyFastaReader.getSequence("/Users/ard/dev/BioJavaTests/test1/src/main/java/org/biojava/ard/test1/mycobacterium.fasta.txt"), "/Users/ard/dev/BioJavaTests/test1/src/main/java/org/biojava/ard/test1/mycobacterium.inverse.fasta.txt");
        } catch (CompoundNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void reverseComplement(String sequence, String resultFilename) throws CompoundNotFoundException {
        //System.out.println("Print reverse of: ");
        //System.out.println(sequence);
        String inverse = getSeq(sequence).getInverse().getSequenceAsString();
        DNASequence inverseSeq = getSeq(inverse);
        inverseSeq.setOriginalHeader(">NC_008705.1:c5737227-1 Mycobacterium sp. KMS, complete genome inverse");
        inverseSeq.setAccession(new AccessionID("NC_008705.1:c5737227-1"));
        try {
            FastaWriterHelper.writeSequence(new File(resultFilename), inverseSeq);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(" reverse: " + inverse);
    }
    private DNASequence getSeq() throws CompoundNotFoundException {
        return getSeq(null);
    }
    private DNASequence getSeq(final String seq) throws CompoundNotFoundException {
        String target = (seq == null) ? "ATGC" : seq;
        return new DNASequence(target);
    }
}
