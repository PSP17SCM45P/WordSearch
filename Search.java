import java.util.*;
import java.io.*;

public class Search {
	public static void main(String[] args) {
		String fileName = getArg(args);
		Puzzle wordSearch = readFile(fileName);
		wordSearch.solve();
	}
	
	public static String getArg(String[] args){
		if (args.length == 1)
		{
			return args[0];
		}
		else
		{
			System.out.print("Launch the program with a single file name. ");
			System.exit(0);
			return null;
		}
	}
	
	public static Puzzle readFile(String fileName) {
		/*
		 * Required file format:
		 * Square, two-dimensional puzzle, followed by an arbitrary number of words to find.
		 * Exception will be thrown if puzzle is not square.
		 */
		final int maxSize = 100;
		final int maxWords = 200;
		File file = new File(fileName);
		try {
			Scanner scanner = new Scanner(file);
			
			// Determine puzzle dimensions and populate first line of array.
			String firstLine = scanner.nextLine();
			int size = firstLine.length();
			char[][] puzzle = new char[size][size];
			for (int col = 0; col < size; col++) {
				puzzle[0][col] = firstLine.charAt(col);
			}
			
			// Populate remainder of array.
			int row = 1; // Don't read beyond the bounds of the puzzle.
	        while (scanner.hasNextLine() && row < size) {
	            String line = scanner.nextLine();
				for (int col = 0; col < size; col++) {
					puzzle[row][col] = line.charAt(col);
				}
				row++;
	        }
	        
	        Vector<String> toFind = new Vector<String>();
	        while (scanner.hasNextLine()) { // Remainder of the file is words to search for.
	        	String word = scanner.nextLine();
	        	if (word.length() > 0)
	        		toFind.add(word);
	        }
	        
			if (firstLine.length() > maxSize || toFind.size() > maxWords) {
				System.out.println("The puzzle is too big or there are too many words being searched for.");
				System.exit(0);
			}
	        
			Puzzle p = new Puzzle(puzzle, toFind);
			scanner.close();
			return p;
	        
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found.");
			return null;
			// e.printStackTrace();
		}
	}

}
