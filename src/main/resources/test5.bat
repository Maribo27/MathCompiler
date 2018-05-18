"C:\Program Files\Java\jre1.8.0_171\bin\java.exe" -jar MathCompiler.jar Program5.txt
timeout /t 2
move Program5.java out/Program5.java
cd out
"C:\Program Files\Java\jdk1.8.0_162\bin\javac.exe" Program5.java
@echo on
java Program5
pause