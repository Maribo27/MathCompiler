"C:\Program Files\Java\jre1.8.0_171\bin\java.exe" -jar MathCompiler.jar Program3.txt
timeout /t 2
move Program3.java out/Program3.java
cd out
"C:\Program Files\Java\jdk1.8.0_162\bin\javac.exe" Program3.java
@echo on
java Program3
pause