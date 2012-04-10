package org.biojava.ard.test1;

import org.biojava3.core.sequence.DNASequence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Testing biojava core version 3.0.3 " );
        App aApp = new App();
        aApp.reverseComplement();
    }
    
    public void reverseComplement() {
        String s = getSeq().getInverse().getSequenceAsString();
        System.out.println("Reversed Complemented of sequence : " + getSeq() + " is: " + s);
    }
    private DNASequence getSeq() {
        return getSeq(null);
    }
    private DNASequence getSeq(final String seq) {
        String target = (seq == null) ? "ATGC" : seq;
        return new DNASequence(target);
    }
}
