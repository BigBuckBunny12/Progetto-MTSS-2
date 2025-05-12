////////////////////////////////////////////////////////////////////<br />
// [GABRIELE] [SCAGGIANTE] [2101076]<br />
// [ANDREA] [LONARDI] [2113199]<br />
////////////////////////////////////////////////////////////////////<br />


<!-- START BUILD INFO -->
### Report sul processo di build
[![Java CI with Maven](https://github.com/BigBuckBunny12/Progetto-MTSS-2/actions/workflows/maven.yml/badge.svg)](https://github.com/BigBuckBunny12/Progetto-MTSS-2/actions/workflows/maven.yml)
Log processo di build Maven (ultime 60 righe):
```
[INFO] 
[INFO] --- resources:3.0.2:resources (default-resources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/src/main/resources
[INFO] 
[INFO] --- compiler:3.8.0:compile (default-compile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/target/classes
[INFO] 
[INFO] --- resources:3.0.2:testResources (default-testResources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/src/test/resources
[INFO] 
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/target/test-classes
[INFO] 
[INFO] --- surefire:3.0.0-M6:test (default-test) @ roman-number ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running it.unipd.mtss.RomanPrinterTest
[INFO] Tests run: 34, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.143 s - in it.unipd.mtss.RomanPrinterTest
[INFO] Running it.unipd.mtss.IntegerToRomanTest
[INFO] Tests run: 50, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.085 s - in it.unipd.mtss.IntegerToRomanTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 84, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- jacoco:0.8.7:report (default-report) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] 
[INFO] --- jar:3.0.2:jar (default-jar) @ roman-number ---
[INFO] Building jar: /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/target/roman-number-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- checkstyle:3.3.1:checkstyle (default) @ roman-number ---
[INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.3 skin.
[INFO] Starting audit...
Audit done.
[INFO] 
[INFO] --- jacoco:0.8.7:check (default-check) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/Progetto-MTSS-2/Progetto-MTSS-2/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] All coverage checks have been met.
[INFO] 
[INFO] --- checkstyle:3.3.1:checkstyle (default-cli) @ roman-number ---
[INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.3 skin.
[INFO] Starting audit...
Audit done.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.950 s
[INFO] Finished at: 2025-05-12T14:54:52Z
[INFO] ------------------------------------------------------------------------
```

Violazioni di stile (Checkstyle):
Errori rilevati: 0
<!-- END BUILD INFO -->
