"C:\Program Files\Java\jre1.8.0_171\bin\java.exe" -jar MathCompiler.jar Program2.txt
timeout /t 2
move Program2.java out/Program2.java
cd out
"C:\Program Files\Java\jdk1.8.0_162\bin\javac.exe" Program2.java
@echo on
java Program2
pause