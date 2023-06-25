package fr.mrtigreroux.tigerreports;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.mrtigreroux.tigerreports.utils.AssertionUtils;

/**
 * @author MrTigreroux
 */
public class DefaultMessagesTest extends TestClass {

	private static final int EXPECTED_LINES_AMOUNT = 220;
	private static final String DEFAULT_MESSAGES_FILE_PATH = "src/main/resources/messages.yml";
	private static final String DEFAULT_MESSAGES_DIRECTORY_NAME = "default-messages";
	private static final String LINE_TO_IGNORE_ADDED_TO_MAKE_INDEX_EQUALS_TO_LINE_NUMBER = "Line to ignore, added to make index = line number";

	@Test
	public void testDefaultMessagesFilesLinesKeys() throws IOException {
		Path refMessagesPath = Paths.get(System.getProperty("user.dir"), DEFAULT_MESSAGES_FILE_PATH);
		if (!Files.isRegularFile(refMessagesPath)) {
			throw new IllegalArgumentException("The file " + DEFAULT_MESSAGES_FILE_PATH + " was not found.");
		}

		File refMessagesFile = refMessagesPath.toFile();
		assertNotNull(refMessagesFile);
		List<String> refLinesKeys = getMessagesFileLinesKeys(refMessagesFile);
		assertNotNull(refLinesKeys);
		assertEquals(EXPECTED_LINES_AMOUNT, refLinesKeys.size() - 1,
		        DEFAULT_MESSAGES_FILE_PATH + ": Incorrect amount of lines"); // -1 for LINE_TO_IGNORE_ADDED_TO_MAKE_INDEX_EQUALS_TO_LINE_NUMBER

		Path defMessagesDir = Paths.get(System.getProperty("user.dir"), DEFAULT_MESSAGES_DIRECTORY_NAME);
		if (!Files.isDirectory(defMessagesDir)) {
			throw new IllegalArgumentException("The directory " + DEFAULT_MESSAGES_DIRECTORY_NAME + " was not found.");
		}

		Files.list(defMessagesDir).filter(Files::isRegularFile).forEach((file) -> {
			File defMessagesFile = file.toFile();
			List<String> linesKeys = getMessagesFileLinesKeys(defMessagesFile);
			AssertionUtils.assertListEquals(refLinesKeys, linesKeys, defMessagesFile.getPath());
		});
	}

	private List<String> getMessagesFileLinesKeys(File file) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			List<String> linesKeys = new ArrayList<>();
			linesKeys.add(LINE_TO_IGNORE_ADDED_TO_MAKE_INDEX_EQUALS_TO_LINE_NUMBER);
			String line = reader.readLine();
			while (line != null) {
				try {
					linesKeys.add(line.split(":")[0]);
				} catch (ArrayIndexOutOfBoundsException ex) {
					fail(file.getPath() + ": Missing key in line " + linesKeys.size(), ex);
				}
				line = reader.readLine();
			}
			return linesKeys;
		} catch (IOException e) {
			fail(e);
			return null;
		}
	}
}
