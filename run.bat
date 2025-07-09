@echo off
echo Deleting all .class and .bak files in the current directory and subdirectories...

REM Delete all .class files
del /s /q *.class

REM Delete all .bak files
del /s /q *.bak

echo Done.
pause
