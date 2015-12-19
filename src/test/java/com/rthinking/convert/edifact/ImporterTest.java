package com.rthinking.convert.edifact;

import org.junit.Test;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by serayuzgur on 18/12/15.
 */
public class ImporterTest {

	@Test
	public void importerTest() {

		InputStream is = ImporterTest.class.getClassLoader().getResourceAsStream("edifact");

		Importer importer = new Importer();
		Map<String, Object> output = importer.read(is);
	}


}