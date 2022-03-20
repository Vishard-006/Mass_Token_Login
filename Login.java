import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor ; 
import java.util.Scanner ;
import java.io.File;
import java.util.ArrayList;

public class Login {
    public static void main(String[] args) throws Exception {
		ArrayList<String> tokens = new ArrayList<String>(); 
		Scanner f = new Scanner(new File("tokens.txt"));
		while (f.hasNextLine()) { //read file
				tokens.add(f.nextLine());
		}

		WebDriverManager.chromedriver().setup();


		String token ;
		for (int k = 0 ; k< tokens.size() ; k++){
			token = tokens.get(k) ; 
			WebDriver driver = new ChromeDriver();
			driver.get("https://discord.com/channels/@me");
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			String script = "function login(token) {setInterval(() => {document.body.appendChild(document.createElement `iframe`).contentWindow.localStorage.token = `\"${token}\"`}, 50);setTimeout(() => {location.reload();}, 750);}" ; 
			js.executeScript(script + "login(" + "\"" + token + "\")") ; 

		}


	}

}


