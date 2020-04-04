package print;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImpressaoArquivoOutput extends Impressao {

	public void escreve() {
		String content = "Hello, World!";
		String local = "C:\\Users\\ferna\\OneDrive\\teste\\output.log";

		try {

			Files.write(Paths.get(local), content.getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}