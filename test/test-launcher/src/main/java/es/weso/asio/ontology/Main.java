package es.weso.asio.ontology;

import es.weso.asio.ontology.test.TestCase;
import es.weso.asio.ontology.test.manifest.ManifestParser;
import es.weso.asio.ontology.test.manifest.impl.ManifestParserImpl;

import java.io.FileNotFoundException;

/**
 * Just a mock class to test the implemented classes.
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ManifestParser p = new ManifestParserImpl(ManifestParser.DEFAULT_MANIFEST_FILE_PATH);
		
		for(TestCase t:p.getTestCases()) {
			System.out.println(t);
		}
		
	}

}