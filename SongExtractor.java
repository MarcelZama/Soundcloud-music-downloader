import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

public class SongExtractor {
    public static void main(String[] args) {
        try {
            // Input file path (replace with your actual file path)
            String filePath = "WHERE-THE-INPUT-FILE-IS\\input.txt";

            // Output file path (replace with your desired output file path)
            String outputPath = "WHERE-THE-OUTPUT-GO-TO\\songs.txt";

            // Create a BufferedReader to read the input file line by line
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // StringBuilder to collect text for each line in the output file
            StringBuilder outputLines = new StringBuilder();

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                // Extract username text if span is found
                int index1 = line.indexOf("<span class=\"soundTitle__usernameText\">");
                if (index1 != -1) {
                    // Move to the next line and extract the text there
                    String nextLine = reader.readLine();  // Read the next line
                    if (nextLine != null) {
                        String usernameText = nextLine.trim();  // Trim any extra spaces or newlines
                        outputLines.append(usernameText);
                        outputLines.append(" - ");
                    }
                }


                // Extract song title text from empty span (with improved logic)
                int index2 = line.indexOf("<span class=\"\">");
                if (index2 != -1 && index2 > index1) { 
                    int endIndex = line.indexOf("</span>", index2);
                    if (endIndex != -1 && endIndex > index2 + 15) {
                        String songTitleText = line.substring(index2 + 15, endIndex).trim();
                        outputLines.append(songTitleText);
                    }

                        // Append a newline character to each processed line
                        if (outputLines.length() > 2) {
                            outputLines.append("\n");
                        }
                }
                
            }

            // Close the reader
            reader.close();

            // Write the collected lines to the output file
            Writer writer = new FileWriter(outputPath);
            writer.write(outputLines.toString());
            writer.close();

            System.out.println("Song data has been written to " + outputPath);
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index error encountered: " + e.getMessage());
        }
    }
}