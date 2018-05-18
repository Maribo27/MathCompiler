"C:\Program Files\Java\jre1.8.0_171\bin\java.exe" -jar MathCompiler.jar Program4.txt
timeout /t 2
move Program4.java out/Program4.java
cd out
"C:\Program Files\Java\jdk1.8.0_162\bin\javac.exe" Program4.java
@echo on
java Program4
pause