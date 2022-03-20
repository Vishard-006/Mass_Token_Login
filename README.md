
# Mass_Token_Login

Useful to login to multiple discord accounts quickly

### Getting Started
1. Clone the repo
2.  Add all your tokens to `tokens.txt`. One token per line.
3. Compile : `javac -cp "./;./lib/*" Login.java`
4. Run : `java -cp "./;./lib/*" Login`

### FAQ
- What is this used for ?
  - Used for logging into multiple discord accounts simultaneously using token
- How does it work ?
	- It reads the tokens from `tokens.txt` , opens a selenium chrome window and logs in using the token
- What is the `lib` folder ?
	- The `lib` folder contains all the libraries that are not part of the JVM such as Selenium, WebdriverManager etc . This is to make it easier for end-users and not require them to download the correct jars.
