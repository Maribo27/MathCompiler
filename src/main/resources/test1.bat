"C:\Program Files\Java\jre1.8.0_171\bin\java.exe" -jar MathCompiler.jar Program1.txt
timeout /t 2
move Program1.java out/Program1.java
cd out
"C:\Program Files\Java\jdk1.8.0_162\bin\javac.exe" Program1.java
@echo on
java Program1
pause