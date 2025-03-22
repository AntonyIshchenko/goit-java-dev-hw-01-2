Create a `Gradle` project. A project must:
- be packaged in an executable FatJar `.jar` file with the name `myname.jar` when the command `gradle jar` launches
- print the first and last name in JSON to the console when the command `java -jar myname.jar` launches. For example, `{"name": "Igor", "lastName": "Petrenko"}`. For creating JSON string use any third-party library from Maven Central
- have the correct `.gitignore` file
- have the Wrapper (the Wrapper files also need to be uploaded to Github)